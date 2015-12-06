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


	public void process(String mailDataJson) {

		MailData data = new Gson().fromJson(mailDataJson, MailData.class);
		String username = properties.getProperty("username");
		String password = properties.getProperty("passwrod");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			if (data.getAddressTO() != null && data.getAddressTO().length > 0) {
				Address[] address = new InternetAddress[data.getAddressTO().length];
				for(int i = 0; i< data.getAddressTO().length ; ++i)
					address[i] = new InternetAddress(data.getAddressTO()[i]);
				message.setRecipients(RecipientType.TO, address);
			}
			if (data.getAddressTO() != null && data.getAddressCC().length > 0) {
				Address[] address = new InternetAddress[data.getAddressCC().length];
				for(int i = 0; i< data.getAddressCC().length ; ++i)
					address[i] = new InternetAddress(data.getAddressCC()[i]);
				message.setRecipients(RecipientType.CC, address);
			}
			if (data.getAddressTO() != null && data.getAddressBCC().length > 0) {
				Address[] address = new InternetAddress[data.getAddressBCC().length];
				for(int i = 0; i< data.getAddressTO().length ; ++i)
					address[i] = new InternetAddress(data.getAddressTO()[i]);
				message.setRecipients(RecipientType.TO, address);
			}
			
			message.setSubject(data.getSubject());
			message.setText(data.getContent());
			Transport.send(message);

			logger.log(Level.INFO, "Send mail: " + new Gson().toJson(data));

		} catch (MessagingException e) {
			logger.log(Level.SEVERE, "Cannot send mail to: " + new Gson().toJson(data), e);
		}

	}
	
	
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
