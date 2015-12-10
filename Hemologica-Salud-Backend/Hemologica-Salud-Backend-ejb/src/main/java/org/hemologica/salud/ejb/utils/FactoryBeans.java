package org.hemologica.salud.ejb.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hemologica.salud.ejb.beans.AdvertismentBeanLocal;
import org.hemologica.salud.ejb.beans.CentersBeanLocal;
import org.hemologica.salud.ejb.beans.CodesBeanLocal;
import org.hemologica.salud.ejb.beans.DonationBeanLocal;
import org.hemologica.salud.ejb.beans.IBloodLocal;
import org.hemologica.salud.ejb.beans.IInstitutionBeanLocal;
import org.hemologica.salud.ejb.beans.PersonBeanLocal;
import org.hemologica.salud.ejb.beans.StatisticsBeanLocal;
import org.hemologica.salud.ejb.beans.StockBeanLocal;
import org.hemologica.salud.ejb.beans.TransfusionBeanLocal;

public class FactoryBeans {
	
	private static final Logger logger = Logger.getLogger(FactoryBeans.class.getName()); 
	
	public static AdvertismentBeanLocal getAdvertismentBean() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/AdvertismentBean!org.hemologica.salud.ejb.beans.impl.AdvertismentBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}
	
	public static PersonBeanLocal getPersonBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/PersonBean!org.hemologica.salud.ejb.beans.PersonBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean PersonBeanLocal", e);
			
		}
		
		return null;
	}
	
	public static CodesBeanLocal getCodeBeans() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/CodesBean!org.hemologica.salud.ejb.beans.impl.CodesBean");
			
		} catch (NamingException e) {

			logger.log(Level.SEVERE,  "Error al obtener el Bean CodesBeanLocal", e);

		}
		return null;
	}
	
	public static CentersBeanLocal getCenterBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/CentersBean!org.hemologica.salud.ejb.beans.CentersBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE, "Error al obtener el Bean CentersBeanLocal", e);
			
		}
			
		return null;
	}
	
	public static DonationBeanLocal getDonationBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/DonationBean!org.hemologica.salud.ejb.beans.impl.DonationBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE, "Error al obtener el Bean DonationBeanLocal", e);
			
		}
		
		return null;
	}
	
	public static TransfusionBeanLocal getTransfusionBean() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/TransfusionBean!org.hemologica.salud.ejb.beans.impl.TransfusionBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}

	public static IBloodLocal getBloodLocal() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/BloodBean!org.hemologica.salud.ejb.beans.IBloodLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}

	public static IInstitutionBeanLocal getInstitutionBean() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/InstitutionBean!org.hemologica.salud.ejb.beans.impl.InstitutionBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}
	
	public static StatisticsBeanLocal getStatisticsBeanLocal() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/StatisticsBean!org.hemologica.salud.ejb.beans.StatisticsBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}
	
	public static StockBeanLocal getStockBeanLocal() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/StockBean!org.hemologica.salud.ejb.beans.impl.StockBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}
	
}
