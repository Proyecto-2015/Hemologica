package org.hemologica.salud.ejb.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hemologica.salud.ejb.business.EmailTask;
import org.hemologica.xmldatabase.connection.impl.BaseXConnection;
import it.sauronsoftware.cron4j.SchedulingPattern;
import it.sauronsoftware.cron4j.Task;
import it.sauronsoftware.cron4j.TaskCollector;
import it.sauronsoftware.cron4j.TaskTable;

public class TaskCron implements TaskCollector {
	
	private Logger logger = Logger.getLogger(TaskCron.class.getName());
	
	@Override
	public TaskTable getTasks() {
		
		
		try {
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			
			
			
			Properties prop = new Properties();
			prop.load(BaseXConnection.class.getClassLoader().getResourceAsStream("hemosalud.properties"));
			String timerCron = prop.getProperty("timerCron");
			
			logger.info("Inicio ejecucion del cron " + sdf.format(Calendar.getInstance().getTime()) + " Patron " + timerCron);
			
			SchedulingPattern pattern = new SchedulingPattern(timerCron);
			
			Task task = new EmailTask();
			TaskTable ret = new TaskTable();
			ret.add(pattern, task);
			
			return ret;
			
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al leer el archivo de propiedades hemosalud.properties", e);
			
		}
		return null;
	}

}
