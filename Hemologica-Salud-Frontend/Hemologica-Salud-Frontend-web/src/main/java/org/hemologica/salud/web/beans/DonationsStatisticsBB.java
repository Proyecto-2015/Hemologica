package org.hemologica.salud.web.beans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.salud.factories.RestFactory;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class DonationsStatisticsBB implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(DonationsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataDonationsStatistics statictic;
	private List<DonationFilterData> allFilters;
	private List<DonationFilterData> allFiltersDenominator;
	private DataDonationsStatisticsResults statisticsResults;
	private Date dateFrom;
	private Date dateTo;
	private StreamedContent file;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	

	@PostConstruct
	private void init(){
		
		allFilters = new ArrayList<DonationFilterData>(applicationBB.getDonationsFilters().size());
		allFiltersDenominator = new ArrayList<DonationFilterData>(applicationBB.getDonationsFilters().size());
	    for(DonationFilterData item: applicationBB.getDonationsFilters()){
			try {
				
				allFilters.add((DonationFilterData) item.clone());
				allFiltersDenominator.add((DonationFilterData) item.clone());
				
			} catch (CloneNotSupportedException e) {
				
				logger.log(Level.SEVERE, "Error al clonar el objeto", e);
				
			}
		}
		
		statictic = new DataDonationsStatistics();
		
	}
    
    public void find(){
    	
    	statictic.setFiltersNumerator(allFilters);
    	statictic.setFiltersDenominator(allFiltersDenominator);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFrom != null)
			statictic.setFromDate(sdf.format(dateFrom));
		if(dateTo != null)
			statictic.setToDate(sdf.format(dateTo));
    	
		statisticsResults = RestFactory.getServicesClient().getDonationsStatistics(statictic);
    	
 
    }

	public DataDonationsStatistics getStatictic() {
		return statictic;
	}
	public void setStatictic(DataDonationsStatistics statictic) {
		this.statictic = statictic;
	}
	public List<DonationFilterData> getAllFilters() {
		return allFilters;
	}
	public void setAllFilters(List<DonationFilterData> allFilters) {
		this.allFilters = allFilters;
	}
	
	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public StreamedContent download(){
		
		try{
			find();
			
			FacesContext context = FacesContext.getCurrentInstance();
			Application app = context.getApplication();
			bundle = app.getResourceBundle(context, languageVarName);
					
			Document document = new Document();
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();	
	        	
	    	PdfWriter p = PdfWriter.getInstance(document, new FileOutputStream("Phrase.pdf"));
	
	        PdfWriter.getInstance(document, byteArrayOutputStream);
	        
	        Rectangle rect = new Rectangle(30, 30, 550, 800);
	        p.setBoxSize("art", rect);
	        
	        document.open();
	        
	        Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
	        Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD);
	        
	        /**
	         * Titulo
	         */
	        
	        Paragraph title = new Paragraph(bundle.getString("label_indicators"), catFont);
	        title.setAlignment(Element.ALIGN_MIDDLE);
	        document.add(title);
	        document.add(Chunk.NEWLINE);
	        
	        /**
	         * Info general
	         */
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Paragraph paragrafInfo = new Paragraph(bundle.getString("donation_date")+ ": " + sdf.format(Calendar.getInstance().getTime()));
	        document.add(paragrafInfo);
	        
	        document.add(Chunk.NEWLINE);
	        
	        Paragraph paragrafVersion = new Paragraph(bundle.getString("label_hemologica_version") + ": " +  bundle.getString("hemologica_version"));
	        document.add(paragrafVersion);
	        document.add(Chunk.NEWLINE);
	        
	        /**
	         * Población general
	         */  
	        
	        Paragraph generalPeople = new Paragraph(bundle.getString("label_general_population"),smallBold);
	        document.add(generalPeople);
	        
	        document.add(new Paragraph(bundle.getString("label_donors_count") +": " + statisticsResults.getCantDonors()));
            document.add(new Paragraph(bundle.getString("label_donations_count") +": " + statisticsResults.getCantDonations()));
	        
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph(bundle.getString("label_general_filter"),smallBold));
            
            if(statictic.getInstitution() != null){
            	
            	document.add(new Paragraph(bundle.getString("label_insitution") + ": " + statictic.getInstitution().getName()));
            	
            }
            if(statictic.getBloodBank() != null){
            	
            	document.add(new Paragraph(bundle.getString("label_bank") + ": " + statictic.getBloodBank().getName()));
            	
            }
            if(statictic.getFromDate() != null && !statictic.getFromDate().equals("")){
            	
            	document.add(new Paragraph(bundle.getString("label_date_from") + ": " + statictic.getFromDate()));
            	
            }
            if(statictic.getToDate() != null && !statictic.getToDate().equals("")){
            	
            	document.add(new Paragraph(bundle.getString("label_date_to") + ": " + statictic.getToDate()));
            	
            }
            
            document.add(new Paragraph(bundle.getString("label_numerator"), smallBold));
            
            for(DonationFilterData filter : statictic.getFiltersNumerator()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + bundle.getString(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null && !filter.getValueString().equals("")){
            		
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + filter.getValueString()));
            		
            	}            	
            }
            
            document.add(new Paragraph(bundle.getString("label_denominator"), smallBold));
            
            for(DonationFilterData filter : statictic.getFiltersDenominator()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + bundle.getString(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null && !filter.getValueString().equals("")){
            	
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + filter.getValueString()));
            		
            	}            	
            }  
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph(bundle.getString("lable_no_data_numerator") +": " + statisticsResults.getNoDataNumerator()));
            document.add(new Paragraph(bundle.getString("lable_no_data_denominator") +": " + statisticsResults.getNoDataDenominator()));	
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph(bundle.getString("label_donors_count") +": "));
            document.add(new Paragraph(bundle.getString("label_numerator") + " " + statisticsResults.getDonorsCount().getCountNumerator() + "   " +
            		bundle.getString("label_denominator") + " " + statisticsResults.getDonorsCount().getCountDenominator() + "   " + 
            		statisticsResults.getDonorsCount().getPercentage() + "%"));
            
            document.add(new Paragraph(bundle.getString("label_donations_count") +": ")); 
            document.add(new Paragraph(bundle.getString("label_numerator") + " " + statisticsResults.getDonationsCount().getCountNumerator() + "   " +
            		bundle.getString("label_denominator") + " " + statisticsResults.getDonationsCount().getCountDenominator() + "   " + 
            		statisticsResults.getDonationsCount().getPercentage() + "%"));
	        
	        document.close();
	        
	        InputStream stream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		
			if(stream != null)
				file = new DefaultStreamedContent(stream, "application/pdf", "indicadores.pdf");
			
		}catch (DocumentException e) {
			
			logger.log(Level.SEVERE, "Error al generar el documento DocumentException", e);
			
		} catch (FileNotFoundException e) {
			
			logger.log(Level.SEVERE, "Error al generar el documento FileNotFoundException", e);
			
		}	
		return file;    
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public DataDonationsStatisticsResults getStatisticsResults() {
		return statisticsResults;
	}

	public void setStatisticsResults(DataDonationsStatisticsResults statisticsResults) {
		this.statisticsResults = statisticsResults;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<DonationFilterData> getAllFiltersDenominator() {
		return allFiltersDenominator;
	}

	public void setAllFiltersDenominator(List<DonationFilterData> allFiltersDenominator) {
		this.allFiltersDenominator = allFiltersDenominator;
	}
}
