package org.hemologica.salud.ejb.utils;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hemologica.datatypes.DataEmailSent;
import org.hemologica.datatypes.DataEmailToSend;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import com.google.gson.Gson;
import it.sauronsoftware.cron4j.Task;
import it.sauronsoftware.cron4j.TaskExecutionContext;

public class EmailTask extends Task{
	
	/**
	 * Manda mails
	 */
	
	private Logger logger = Logger.getLogger(TaskCron.class.getName());
	private Properties prop;
	
	@Override
	public void execute(TaskExecutionContext context) throws RuntimeException {
		
		
		try {
			
			logger.info("Inicio envio de mails");
			
			prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("hemosalud.properties"));
			
			final String username = prop.getProperty("mail.username");
			final String password = prop.getProperty("mail.password");
			
			Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			logger.info("Busco mail a enviar");
			
			List<DataEmailToSend> emails = FactoryBeans.getAdvertismentBean().getEmailsToSend(Calendar.getInstance());
			
			for(DataEmailToSend dataEmail : emails){
				
				Message message = new MimeMessage(session);
				try {
					message.setFrom(new InternetAddress(username));
					InternetAddress[] ret = new InternetAddress[1];

					ret[0] = new InternetAddress(dataEmail.getEmailToSendPerson().getEmail());
					
					message.setRecipients(RecipientType.TO, ret);
					message.setSubject(dataEmail.getEmailToSendSubject());
					
					message.setContent(dataEmail.getEmailToSendText(), "text/html");

					Transport.send(message);

					DataEmailSent sentEmail = new DataEmailSent();
					sentEmail.setEmailEffectiveSentDate(Calendar.getInstance());
					sentEmail.setEmailSentDate(dataEmail.getEmailToSendDate());
					sentEmail.setEmailSentFrom(username);
					sentEmail.setEmailSentSubject(dataEmail.getEmailToSendSubject());
					sentEmail.setEmailSentText(dataEmail.getEmailToSendText());
					sentEmail.setEmailSentTo(dataEmail.getEmailToSendPerson().getEmail());
					sentEmail.setEmailToSentPerson(dataEmail.getEmailToSendPerson());

					FactoryBeans.getAdvertismentBean().addEmailSent(sentEmail);
					
					FactoryBeans.getAdvertismentBean().removeEmail(dataEmail);
					
				} catch (AddressException e) {
					
					logger.log(Level.SEVERE, "AddressException Cannot send mail to: " + new Gson().toJson(dataEmail), e);
					
				} catch (MessagingException e) {
					
					logger.log(Level.SEVERE, "MessagingException Cannot send mail to: " + new Gson().toJson(dataEmail), e);
					
				}
					
			}	
			
			logger.info("FIn de envio de mails");
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al leer el archivo de propiedades hemosalud.properties", e);
			
		}
		

		
	}

}
