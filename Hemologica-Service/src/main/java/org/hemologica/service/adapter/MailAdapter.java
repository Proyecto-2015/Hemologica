package org.hemologica.service.adapter;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Address;
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
			if(data.getAddressTO() != null && data.getAddressTO().size() > 0){
				message.setRecipients(RecipientType.TO, (Address[]) data.getAddressTO().toArray());
			}
			if(data.getAddressCC() != null && data.getAddressCC().size() > 0){
				message.setRecipients(RecipientType.CC, (Address[]) data.getAddressCC().toArray());
			}
			if(data.getAddressBCC() != null && data.getAddressBCC().size() > 0){
				message.setRecipients(RecipientType.BCC, (Address[]) data.getAddressBCC().toArray());
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
