package org.hemologica.factories;

import javax.persistence.EntityManager;

import org.hemologica.dao.IAdvertismentDAO;
import org.hemologica.dao.IBloodDAO;
import org.hemologica.dao.ICenterDAO;
import org.hemologica.dao.ICodesDAO;
import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.IInstitutionDAO;
import org.hemologica.dao.IMovementDAO;
import org.hemologica.dao.INotificationDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.IUnitDAO;
import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.impl.AdvertismentDAOImpl;
import org.hemologica.dao.impl.BloodDAOImpl;
import org.hemologica.dao.impl.CenterDAOImpl;
import org.hemologica.dao.impl.CodesDAOImpl;
import org.hemologica.dao.impl.IdentificationDAOImpl;
import org.hemologica.dao.impl.InstitutionDAOImpl;
import org.hemologica.dao.impl.MovementDAOImpl;
import org.hemologica.dao.impl.NotificationDAOImpl;
import org.hemologica.dao.impl.PersonDAOImpl;
import org.hemologica.dao.impl.PersonRecordDAOImpl;
import org.hemologica.dao.impl.UnitDAOImpl;
import org.hemologica.dao.impl.UserDAOImpl;

public class FactoryDAO {


	public static IPersonDAO getRestServicesUtils(EntityManager em) {
		return new PersonDAOImpl(em);
	}

	public static IInstitutionDAO getInstitutionDAO(EntityManager em) {
		return new InstitutionDAOImpl(em);
	}

	public static IBloodDAO getbloodDAO(EntityManager em) {
		return new BloodDAOImpl(em);
	}

	public static ICodesDAO getCodesDAO(EntityManager em) {
		return new CodesDAOImpl(em);
	}

	public static ICenterDAO getCenterDAO(EntityManager em) {
		return new CenterDAOImpl(em);
	}

	public static IIdentificationDAO getIIdentificationDAO(EntityManager em) {
		return new IdentificationDAOImpl(em);
	}
	
	public static IPersonDAO getPeronDAO(EntityManager em) {
		return new PersonDAOImpl(em);
	}

	public static IPersonRecordDAO getPeronRecordDAO(EntityManager em) {
		return new PersonRecordDAOImpl(em);
	}

	public static IAdvertismentDAO getAdvertismentDAO(EntityManager em) {
		return new AdvertismentDAOImpl(em);
	}

	public static INotificationDAO getNotificationDAO(EntityManager em) {
		return new NotificationDAOImpl(em);

	}
	
	public static IPersonRecordDAO getPersonRecordDAO(EntityManager em) {
		return new PersonRecordDAOImpl(em);
	}
	
	public static IUserDAO getUserDAO(EntityManager em){
		return new UserDAOImpl(em);
	}
	
	public static IMovementDAO getMovementDAO(EntityManager em){
		return new MovementDAOImpl(em);
	}
	
	public static IUnitDAO getUnitDAO(EntityManager em){
		return new UnitDAOImpl(em);
	}
}
