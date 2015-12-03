package org.hemologica.service.ws.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jws.WebService;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.hemologica.dao.model.Movement;
import org.hemologica.service.business.IMovementBean;
import org.hemologica.service.datatype.MovementData;
import org.hemologica.service.ws.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService(endpointInterface = "org.hemologica.service.ws.Service")
public class ServiceImpl implements Service {

	private static final Logger logger = Logger.getLogger(ServiceImpl.class.getName());

	public void provideCDA(String cda) {

		try {
			
//			ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/beans.xml");

			Properties prop = new Properties();
			InputStream stream = ServiceImpl.class.getClassLoader().getResourceAsStream("hemologica.properties");
			prop.load(stream);

//			ActiveMQConnectionFactory factory = (ActiveMQConnectionFactory) context.getBean("connectionFactory");
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(prop.getProperty("jms.connection.factory.broker.url"));
			// Create a Connection
			Connection connection = factory.createConnection();
			connection.start();

			// Create a Session
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// Create the destination (Topic or Queue)
			Destination destination = session.createQueue(prop.getProperty("jms.queue.cda.receive"));

			// Create a MessageProducer from the Session to the Topic or Queue
			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			// Create a messages

			TextMessage message = session.createTextMessage(cda);
			producer.send(message);

			// Clean up
			session.close();
			connection.close();

		} catch (JMSException e) {
			logger.log(Level.SEVERE, null, e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, null, e);
		}

	}


	@Override
	public void importMovements(List<MovementData> movements) throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/beans.xml");
		IMovementBean movementBean = (IMovementBean) context.getBean("movementBean");
		movementBean.save(movements);
		
	}

}
