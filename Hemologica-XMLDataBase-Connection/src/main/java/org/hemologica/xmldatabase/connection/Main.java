package org.hemologica.xmldatabase.connection;



public class Main {
	

	
	public static void main(String[] args) {
		
		
		 //XQDataSource xqs = new BaseXXQDataSource();
		    
				try {
					IXMLDataBase xbase = XMLDataBaseFactory.getIXMLDataBase();
					
					
					for(String cda : xbase.getElementPatientId("")){
						
						System.out.println(cda);
						
					}
					
					//xbase.addElement("/Users/paularoche/Documents/Proyecto/xml-database/1.xml");
					
					//xbase.updateElement("1.xml","/Users/paularoche/Documents/Proyecto/xml-database/1.xml");
					//xbase.updateElement("1.xml");
					
//					xbase.addElement("/Users/paularoche/Documents/Proyecto/CDAs-Repo/cda1-Paula.xml");
//					xbase.addElement("/Users/paularoche/Documents/Proyecto/CDAs-Repo/cda2-Paula.xml");
//					xbase.addElement("/Users/paularoche/Documents/Proyecto/CDAs-Repo/cda3.xml");
//					xbase.addElement("/Users/paularoche/Documents/Proyecto/CDAs-Repo/cda4.xml");
//					xbase.addElement("/Users/paularoche/Documents/Proyecto/CDAs-Repo/cda5.xml");
					
					
//					 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//				     DocumentBuilder builder = factory.newDocumentBuilder();
//				     Document doc = builder.parse(new InputSource(new StringReader(xbase.getElement("1.xml"))));
//				     System.out.println(doc);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		    	
//		    	BaseXClient session;
//				try {
//					session = new BaseXClient("localhost", 1984, "admin", "admin");
//					
					//session.execute("create db database");
//					System.out.println(session.execute("info"));
					
					
					//xml-database
				    //final String input = "db:list-details(\"xml-database\")"; // Elementos
				    //final String input = "db:open(\"xml-database\")"; // Todos los elementos
				    
				    //final String input = "db:create(\"NuevaDb\")";
				    
					//final String input = "db:add(\"NuevaDb\", \"/Users/paularoche/Documents/Proyecto/xml-database/1.xml\")";
					//final String input = "db:open(\"NuevaDb\", \"1.xml\")"; // Todos los elementos
					
					//final String input = "db:delete(\"NuevaDb\", \"1.xml\")"; // Borrar.
					
					
//					final String input = "db:open(\"NuevaDb\", \"1.xml\") "; // Todos los elementos
//					
//			        final BaseXClient.Query query = session.query(input);
//			        
//			        
//			        
//			        String nodo = query.next();
//			        System.out.println("*** NODO **");
//			        System.out.println(nodo);
//			        
//			        JAXBContext jaxbContext;
//					try {
//						jaxbContext = JAXBContext.newInstance(Persona.class);
//						Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//				        StringReader reader = new StringReader(nodo);
//				       
//				        Persona person = (Persona) unmarshaller.unmarshal(reader);
//				        
//				        System.out.println("*** Persona **");
//				        
//				        if(person != null){
//				        	
//				        	System.out.println(person.getNombre());
//				        	System.out.println(person.getApellido());
//				        	System.out.println(person.getCi());
//				        	System.out.println(person.getDireccion());
//				        	
//				        }
//						
//					} catch (JAXBException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//			       
//
//			        // loop through all results
//			        
//			        
//			        while(query.more()) {
//			          System.out.println(query.next());
//			        }
//					 final InputStream bais =
//			         
//					new ByteArrayInputStream("<xml>Hello World!</xml>".getBytes());
//
//			          // create new database
//			          session.create("database", bais);
//			          System.out.println(session.info());
//
//			          // run query on database
//			          System.out.println(session.execute("xquery doc('database')"));
//
//			          // drop database
//			          session.execute("drop db database");
					
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

		          // define input stream
		         

		    	
		    	
		    	
		    	
		    	
//				xqs.setProperty("serverName", "localhost");
//				
//				xqs.setProperty("port", "1984");
//
//			    // Change USERNAME and PASSWORD values
//			    XQConnection conn = xqs.getConnection("admin", "admin");
//
//			    XQPreparedExpression xqpe =
//			    conn.prepareExpression("declare variable $x as xs:string external; $x");
//
//			    xqpe.bindString(new QName("x"), "Hello World!", null);
//
//			    XQResultSequence rs = xqpe.executeQuery();

//			    while(rs.next())
//			      System.out.println(rs.getItemAsString(null));
//			    
//			    new CreateDB("persona", "src/main/resources/xml/persona.xml").execute(context);
//
//			    // Close and reopen the database
//			    System.out.println("\n* Close and reopen database.");
//
//			    new Close().execute(context);
//			    new Open("persona").execute(context);
			    
//			    conn.prepareExpression("/persona/nombre");
//			    
//			    String o = new Open("/Users/paularoche/Documents/Proyecto/xml-database").execute(context);
////			    
			//    String query ="for $x in doc('/Users/paularoche/Documents/Proyecto/xml-database/1.xml')//li return data($x)";
			    
			    
			 //   System.out.println(new XQuery(query).execute(context));
			    
			    
//			    System.out.println(new XQuery("/persona/nombre").execute(context));
			    
			    
		
		    
		 
//		String query =
//		        "for $x in doc('/Users/paularoche/Documents/Proyecto/xml-database/')//li return data($x)";
//
//		    // Process the query by using the database command
//	    System.out.println("\n* Use the database command:");
//
//	    try {
//			System.out.println(new XQuery(query).execute(context));
//			
//		} catch (BaseXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	    // Directly use the query processor
//	    System.out.println("\n* Use the query processor:");
	}

}
