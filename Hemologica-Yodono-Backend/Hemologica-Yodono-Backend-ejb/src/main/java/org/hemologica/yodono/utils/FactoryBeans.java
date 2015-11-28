package org.hemologica.yodono.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.hemologica.yodono.ejb.beans.AdvertismentBeanLocal;
import org.hemologica.yodono.ejb.beans.CentersBeanLocal;
import org.hemologica.yodono.ejb.beans.CodesBeanLocal;
import org.hemologica.yodono.ejb.beans.DonationBeanLocal;
import org.hemologica.yodono.ejb.beans.PersonBeanLocal;

public class FactoryBeans {
	
	private static final Logger logger = Logger.getLogger(FactoryBeans.class.getName()); 
	
//	@Inject
//	private DonationBean donationBean;
//	
//	@Inject
//	private CentersBeanLocal centerBeans;
//	
//	@Inject
//	private PersonBeanLocal personBeans;
//	
//	@Inject
//	private AdvertismentBeanLocal advertismentBean;
//	
//	@Inject
//	private CodesBeanLocal codeBeans;
	
	public static AdvertismentBeanLocal getAdvertismentBean() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/AdvertismentBean!org.hemologica.yodono.ejb.beans.AdvertismentBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean AdvertismentBeanLocal", e);
			
		}
		return null;
	}
	
	public static PersonBeanLocal getPersonBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/PersonBean!org.hemologica.yodono.ejb.beans.PersonBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE,  "Error al obtener el Bean PersonBeanLocal", e);
			
		}
		
		return null;
	}
	
	public static CodesBeanLocal getCodeBeans() {
		
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/CodesBean!org.hemologica.yodono.ejb.beans.CodesBeanLocal");
			
		} catch (NamingException e) {

			logger.log(Level.SEVERE,  "Error al obtener el Bean CodesBeanLocal", e);

		}
		return null;
	}
	
	public static CentersBeanLocal getCenterBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/CentersBean!org.hemologica.yodono.ejb.beans.CentersBeanLocal");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE, "Error al obtener el Bean CentersBeanLocal", e);
			
		}
			
		return null;
	}
	
	public static DonationBeanLocal getDonationBean() {
			
		try {
			
			return InitialContext.doLookup("java:global/Hemologica-Yodono-Backend-ear/Hemologica-Yodono-Backend-ejb/DonationBean!org.hemologica.yodono.ejb.beans.impl.DonationBean");
			
		} catch (NamingException e) {
			
			logger.log(Level.SEVERE, "Error al obtener el Bean DonationBeanLocal", e);
			
		}
		
		return null;
	}
}
