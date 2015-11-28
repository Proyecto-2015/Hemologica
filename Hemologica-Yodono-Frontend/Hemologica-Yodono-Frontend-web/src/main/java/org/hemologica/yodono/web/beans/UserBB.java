package org.hemologica.yodono.web.beans;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.yodono.factories.RestFactory;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

public class UserBB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ApplicationBB applicationBB;
	private SessionBB sessionBB;
	
	private static final Logger logger = Logger.getLogger(UserBB.class.getName()); 
	private DataPerson dataUser;
	private List<DataCode> states;
	private DataCode state;
	private List<DataCode> cities;
	private DataCode city;
	private Date birthdayDate;
	
	private UploadedFile uploadedPicture;
	private StreamedContent image;
	private byte[] imageByte;
	
	@ManagedProperty("#{messages}")
	private ResourceBundle bundle;
	private String languageVarName = "messages";
	
	@PostConstruct
	public void init(){
		
		try {
			
			dataUser = sessionBB.getDataUser();
			states = applicationBB.getStates();
			state = dataUser.getState();
			city = dataUser.getCity();
			
			if(dataUser.getImage() != null && dataUser.getImage().length != 0){
				
				image = new DefaultStreamedContent(new ByteArrayInputStream(dataUser.getImage()));
				
			}else{

				File file = new File("/Users/paularoche/Desktop/img.png");
				
				
				byte[] bFile = new byte[(int) file.length()];
//			        
				FileInputStream fileInputStream = new FileInputStream(file);
				fileInputStream.read(bFile);
				fileInputStream.close();
				imageByte = bFile;
//				image =  new DefaultStreamedContent(new FileInputStream(file), "image/png");
				

				//imageByte = imgBytes;
				
				image = new DefaultStreamedContent(new ByteArrayInputStream(bFile), "image/png"); 
				
			}
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web", e);
		}
	}
	
	public DataPerson getDataUser() {
		
		return dataUser;
	}
	
	public void setDataUser(DataPerson dataUser) {
		this.dataUser = dataUser;
	}
	
	public void setBirthdayDate(Date date){
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = format.format(date);
		birthdayDate = date;
		this.dataUser.setBirthdayDate(dateString);
		
	}
	
	public Date getBirthdayDate(){
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			
			birthdayDate = format.parse(dataUser.getBirthdayDate());
			
		} catch (ParseException e) {
			
			logger.log(Level.SEVERE, "Error al parsear la fecha", e);
			
		}
		return birthdayDate;
	}
	
	public List<DataCode> getStates() {
		return states;
	}

	public void setStates(List<DataCode> states) {
		this.states = states;
	}

	public DataCode getState() {
		return state;
	}

	public void setState(DataCode state) {
		this.state = state;
	}

	public List<DataCode> getCities() {
		return cities;
	}

	public void setCities(List<DataCode> cities) {
		this.cities = cities;
	}

	public DataCode getCity() {
		return city;
	}

	public void setCity(DataCode city) {
		this.city = city;
	}

	public UploadedFile getUploadedPicture() {
		return uploadedPicture;
	}

//	public void setUploadedPicture(UploadedFile uploadedPicture) {
//		this.uploadedPicture = uploadedPicture;
//		
//		try {
//			InputStream input = uploadedPicture.getInputstream();
//			byte[] bytes = IOUtils.toByteArray(input);
//			dataUser.setImage(bytes);
//			image = new DefaultStreamedContent(new ByteArrayInputStream(dataUser.getImage()));
//			
//			
//		} catch (IOException e) {
//			
//			logger.log(Level.SEVERE, "Error al leer la imagen", e);
//		}
//	}

	public StreamedContent getImage() {
		return image;
	}

	public void setImage(StreamedContent image) {
		this.image = image;
	}

	public byte[] getImageByte() {
		return imageByte;
	}

	public void setImageByte(byte[] imageByte) {
		this.imageByte = imageByte;
	}

	public List<DataCode> getCitiesState(String stateCode){
		
		try {
			
			return RestFactory.getServicesClient().getCities(stateCode);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error obtener las cidades del departamento: " + stateCode, e);
			
		}
		return null;
	}
	
	public void submit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		bundle = app.getResourceBundle(context, languageVarName);
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, null, bundle.getString("message_save_error"));
		
		try {
			
			DataResponse response = RestFactory.getServicesClient().updateUserData(this.dataUser);
			
			if(response != null && response.getCode() == 0){
				
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, bundle.getString("message_save_success"));
	
			}else if(response != null && response.getCode() != 0){
				
				logger.log(Level.SEVERE, "no se puso gurdar la informacion del usuario: " + response.getErrorMessage());
				
			}else{
				
				logger.log(Level.SEVERE, "Error al llamar al servicio web, response es null");
				
			}
		
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web IOException", e);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}

	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
}
