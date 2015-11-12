package org.hemologica.factories;

import javax.persistence.EntityManager;

import org.hemologica.dao.IInstitutionDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.impl.InstitutionDAOImpl;
import org.hemologica.dao.impl.PersonDAOImpl;

public class FactoryDAO {
	
	private static IInstitutionDAO institutionDAO;
	private static IPersonDAO personDAO;
	
	
	public static IPersonDAO getRestServicesUtils(EntityManager em) {
		
		if(personDAO == null){
			
			return new PersonDAOImpl(em);
			
		}
		return personDAO;
	}
	
	public static IInstitutionDAO getInstitutionDAO(EntityManager em) {
		
		if(institutionDAO == null){
			
			 return new InstitutionDAOImpl(em);
			 
		}
		return institutionDAO;
	}
}
