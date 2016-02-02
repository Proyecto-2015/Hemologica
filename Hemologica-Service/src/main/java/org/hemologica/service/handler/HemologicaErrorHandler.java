package org.hemologica.service.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class HemologicaErrorHandler implements ErrorHandler{
	

	private static Logger log = Logger.getLogger(HemologicaErrorHandler.class.getName());
	
    @Override
    public void handleError(Throwable t) {
        log.log(Level.SEVERE, "Error in listener", t);
    }

}
