package org.hemologica.salud.web.initialized;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hemologica.salud.ejb.utils.TaskCron;

import it.sauronsoftware.cron4j.Scheduler;
import it.sauronsoftware.cron4j.TaskCollector;

public class InitializedListener implements ServletContextListener {
	
	private Logger logger = Logger.getLogger(InitializedListener.class.getName());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		initCron(sce);
		
	}

	private void initCron(ServletContextEvent sce) {
		
		logger.info("Creando el cron..");
		
		ServletContext context = sce.getServletContext();

		Scheduler scheduler = new Scheduler();

		try {

			TaskCollector col = new TaskCron();
			
			scheduler.addTaskCollector(col);
			
			logger.info("User Scheduler creado");

		} catch (Exception ex) {
			
			logger.log(Level.SEVERE, "Error Creando Scheduler", ex);
		}

		scheduler.start();

		context.setAttribute("cron4j.scheduler", scheduler);

		logger.info("[Hawaii] Cron creado " + scheduler);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}


}
