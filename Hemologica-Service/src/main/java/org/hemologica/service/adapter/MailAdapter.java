package org.hemologica.service.adapter;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hemologica.service.datatype.MailData;
import com.google.gson.Gson;

public class MailAdapter {

	private static final Logger logger = Logger.getLogger(MailAdapter.class.getName());
	
	private Properties properties;
	private String username;
	private String password;

	public void send(MailData data) {

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(data.getFrom()));
			if(data.getAddressTO() != null && data.getAddressTO().length > 0){
				message.setRecipients(RecipientType.TO, data.getAddressTO());
			}
			if(data.getAddressCC() != null && data.getAddressCC().length > 0){
				message.setRecipients(RecipientType.CC, data.getAddressCC());
			}
			if(data.getAddressCCO() != null && data.getAddressCCO().length > 0){
				message.setRecipients(RecipientType.BCC, data.getAddressCCO());
			}
			message.setSubject(data.getSubjet());
			message.setText(data.getContent());

			Transport.send(message);
			
			logger.log(Level.INFO, "Send mail: "+ new Gson().toJson(data));

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
