package org.hemologica.cda.validator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());


	public static void main(String[] args) {

		
//		if(args.length != 2){
//			System.out.println("Ingrese el archivo xsd y el archivo xml como argumentos");
//			return;
//		}
//
//		String xsd = args[0];
//		String xml = args[0];
		String xsd = "/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service/src/main/resources/xsd/cda.xsd";
		String xml[] = {
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_2.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_3.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/CDA_4.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.31.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.32.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.33.xml",
				"/home/bruno/Desarrollo/Proyectos/Prueba Paula/Hemologica/Hemologica-Service-Client-Stub/2.16.858.0.0.1.10.2.3.1.1.1.34.xml"
		};
		
		
		try {
			
			int i = 0;
			for(String x : xml){
				if(	XMLUtils.validateWithExtXSDUsingSAX(new FileInputStream(x), new FileInputStream(xsd)) ){
					System.out.println(i + ": VALIDO");
				}else{
					System.out.println(i + ": INVALIDO");
				}
				i++;
			}
			
		} catch (Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage(), ex);
		}
		
	}

}
