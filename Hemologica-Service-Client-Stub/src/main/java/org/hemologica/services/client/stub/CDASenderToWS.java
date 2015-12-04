package org.hemologica.services.client.stub;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.hemologica.service.ws.client.impl.Service;
import org.hemologica.service.ws.client.impl.ServiceImplService;

public class CDASenderToWS {
	
	
public static void main(String[] args) throws Exception {
		
		if(args.length != 2){
			System.out.println("ingrese la url del archivo que desea enviar");
			return;
		}

		String url = args[0];
		String path = args[1];
		
		
		ServiceImplService service = new ServiceImplService(new URL(url));
		Service port = service.getServiceImplPort();
		port.provideCDA(FileUtils.readFileToString(new File(path)));
		
    }

}
