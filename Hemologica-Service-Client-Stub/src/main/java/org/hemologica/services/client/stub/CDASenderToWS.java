package org.hemologica.services.client.stub;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.hemologica.service.ws.client.impl.Service;
import org.hemologica.service.ws.client.impl.ServiceImplService;

public class CDASenderToWS {
	
	
public static void main(String[] args) throws Exception {
		
		if(args.length == 0){
			System.out.println("ingrese la url del archivo que desea enviar");
			return;
		}

		String path = args[0];
		
		ServiceImplService service = new ServiceImplService();
		Service port = service.getServiceImplPort();
		port.provideCDA(FileUtils.readFileToString(new File(path)));
		
    }

}
