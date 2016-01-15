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
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.factories.RestFactory;
import org.hemologica.salud.web.rest.reports.FooterAndHeader;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class TransfusionsStatisticsBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(TransfusionsStatisticsBB.class.getName());
	
	private ApplicationBB applicationBB;
	private DataTransfusionsStatistics statictic;
	private List<TransfusionFilterData> allFilters;
	private List<TransfusionFilterData> allFiltersDenominator;
	private Date dateFrom;
	private Date dateTo;
	private DataTransfusionsStatisticsResults statisticsResults;
	
	private StreamedContent file;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";

	@PostConstruct
	private void init(){
		
		allFilters = new ArrayList<TransfusionFilterData>(applicationBB.getTransfusionsFilters().size());
		allFiltersDenominator = new ArrayList<TransfusionFilterData>(applicationBB.getDonationsFilters().size());
	 
		for(TransfusionFilterData item: applicationBB.getTransfusionsFilters()){
			try {
				
				allFilters.add((TransfusionFilterData) item.clone());
				allFiltersDenominator.add((TransfusionFilterData) item.clone());
				
			} catch (CloneNotSupportedException e) {
				
				logger.log(Level.SEVERE, "Error al clonar el objeto", e);
				
			}
		}
			
		statictic = new DataTransfusionsStatistics();
			
	}
    
    public void find(){
    	
    	
    	logger.info("IR a buscar la infoooo");
    	
    	statictic.setFilters(allFilters);
    	statictic.setAllFiltersDenominator(allFiltersDenominator);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFrom != null)
			statictic.setFromDate(sdf.format(dateFrom));
		if(dateTo != null)
			statictic.setToDate(sdf.format(dateTo));
    	
		statisticsResults = RestFactory.getServicesClient().getTransfusionsStatistics(statictic);
    }

	public DataTransfusionsStatistics getStatictic() {
		return statictic;
	}

	public void setStatictic(DataTransfusionsStatistics statictic) {
		this.statictic = statictic;
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

	public List<TransfusionFilterData> getAllFilters() {
		return allFilters;
	}

	public void setAllFilters(List<TransfusionFilterData> allFilters) {
		this.allFilters = allFilters;
	}
	
	public DataTransfusionsStatisticsResults getStatisticsResults() {
		return statisticsResults;
	}

	public void setStatisticsResults(DataTransfusionsStatisticsResults statisticsResults) {
		this.statisticsResults = statisticsResults;
	}

	public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	            "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
	     
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<TransfusionFilterData> getAllFiltersDenominator() {
		return allFiltersDenominator;
	}

	public void setAllFiltersDenominator(List<TransfusionFilterData> allFiltersDenominator) {
		this.allFiltersDenominator = allFiltersDenominator;
	}
	
public StreamedContent download(){
		
		try{
			find();
			
			FacesContext context = FacesContext.getCurrentInstance();
			Application app = context.getApplication();
			bundle = app.getResourceBundle(context, languageVarName);
					
			Document document = new Document(PageSize.A4, 36, 36, 54, 54);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();	
	        	
	    	PdfWriter p = PdfWriter.getInstance(document, byteArrayOutputStream);
	        
	        Rectangle rect = new Rectangle(30, 30, 550, 800);
	        p.setBoxSize("art", rect);
	        
	        FooterAndHeader event = new FooterAndHeader();
	        p.setPageEvent(event);
	        
	        document.open();
	        
	        Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
	        Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD);
	        
	        /**
	         * Titulo
	         */
	        
	        Paragraph title = new Paragraph(bundle.getString("label_indicators"), catFont);
	        title.setAlignment(Element.ALIGN_CENTER);
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
	        
	        document.add(new Paragraph(bundle.getString("label_person_transfusions_count") +": " + statisticsResults.getCantPersonTransfusion()));
            document.add(new Paragraph(bundle.getString("label_transfusions_count") +": " + statisticsResults.getCantTransfusions()));
            document.add(new Paragraph(bundle.getString("label_adverse_events_count") +": " + statisticsResults.getCantEvents()));
	        
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
            
            for(TransfusionFilterData filter : statictic.getFilters()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + bundle.getString(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null && !filter.getValueString().equals("")){
            		
            		document.add(new Paragraph(bundle.getString(filter.getDisplayName()) +": " + filter.getValueString()));
            		
            	}            	
            }
            
            document.add(new Paragraph(bundle.getString("label_denominator"), smallBold));
            
            for(TransfusionFilterData filter : statictic.getAllFiltersDenominator()){
            	
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
            
            document.add(new Paragraph(bundle.getString("label_person_transfusions_count")));
            document.add(new Paragraph(bundle.getString("label_numerator") + " " + statisticsResults.getPersonTransfusionsCount().getCountNumerator() + "   " +
            		bundle.getString("label_denominator") + " " + statisticsResults.getPersonTransfusionsCount().getCountDenominator() + "   " + 
            		statisticsResults.getPersonTransfusionsCount().getPercentage() + "%"));
            
            
            document.add(new Paragraph(bundle.getString("title_transfusions")));
            document.add(new Paragraph(bundle.getString("label_numerator") + " " + statisticsResults.getTransfusionsCount().getCountNumerator() + "   " +
            		bundle.getString("label_denominator") + " " + statisticsResults.getTransfusionsCount().getCountDenominator() + "   " + 
            		statisticsResults.getTransfusionsCount().getPercentage() + "%"));
	        
            document.add(new Paragraph(bundle.getString("label_adverse_events_count")));
            document.add(new Paragraph(bundle.getString("label_numerator") + " " + statisticsResults.getAdversEventsCount().getCountNumerator() + "   " +
            		bundle.getString("label_denominator") + " " + statisticsResults.getAdversEventsCount().getCountDenominator() + "   " + 
            		statisticsResults.getAdversEventsCount().getPercentage() + "%"));
            
	        document.close();
	        
	        InputStream stream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		
			if(stream != null)
				file = new DefaultStreamedContent(stream, "application/pdf", "indicadores.pdf");
			
		}catch (DocumentException e) {
			
			logger.log(Level.SEVERE, "Error al generar el documento DocumentException", e);
			
		}	
		return file;    
	}

}
