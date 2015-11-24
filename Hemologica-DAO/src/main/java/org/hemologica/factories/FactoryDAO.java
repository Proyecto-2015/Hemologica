package org.hemologica.factories;

import javax.persistence.EntityManager;

import org.hemologica.dao.IAdvertismentDAO;
import org.hemologica.dao.IBloodDAO;
import org.hemologica.dao.ICenterDAO;
import org.hemologica.dao.ICodesDAO;
import org.hemologica.dao.IInstitutionDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.impl.AdvertismentDAOImpl;
import org.hemologica.dao.impl.BloodDAOImpl;
import org.hemologica.dao.impl.CenterDAOImpl;
import org.hemologica.dao.impl.CodesDAOImpl;
import org.hemologica.dao.impl.InstitutionDAOImpl;
import org.hemologica.dao.impl.PersonDAOImpl;

public class FactoryDAO {
	
	private static IInstitutionDAO institutionDAO;
	private static IPersonDAO personDAO;
	private static IBloodDAO bloodDAO;
	private static ICodesDAO codesDAO;
	private static ICenterDAO centerDAO;
	private static IAdvertismentDAO advertismentDAO;
	
	
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
	
	public static IBloodDAO getbloodDAO(EntityManager em) {
		
		if(bloodDAO == null){
			
			 return new BloodDAOImpl(em);

		}
		return bloodDAO;
	}
	
	public static ICodesDAO getCodesDAO(EntityManager em) {
		
		if(codesDAO == null){
			
			 return new CodesDAOImpl(em);

		}
		return codesDAO;
	}

	public static ICenterDAO getCenterDAO(EntityManager em) {
		
		if(centerDAO == null){
			
			 return new CenterDAOImpl(em);

		}
		return centerDAO;
	}
	
	public static IPersonDAO getPeronDAO(EntityManager em) {
		
		if(personDAO == null){
			
			 return new PersonDAOImpl(em);

		}
		return personDAO;
	}
	
	public static IAdvertismentDAO getAdvertismentDAO(EntityManager em) {
		
		if(advertismentDAO == null){
			
			return new AdvertismentDAOImpl(em);
			
		}
		return advertismentDAO;
	}
}
