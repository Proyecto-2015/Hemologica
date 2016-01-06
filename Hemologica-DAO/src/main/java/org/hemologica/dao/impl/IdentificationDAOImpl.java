package org.hemologica.dao.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.IGenericDAO;
import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.INotificationPersonDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.IUserDAO;
import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.IdentificationsHistory;
import org.hemologica.dao.model.NotificationsPerson;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.User;

public class IdentificationDAOImpl implements IIdentificationDAO {

	private static final Logger logger = Logger.getLogger(IdentificationDAOImpl.class.getName());
	
	private EntityManager em;
	private IGenericDAO<Identification> idDAO;
	private IGenericDAO<IdentificationsHistory> idHistoryDAO;

	public IdentificationDAOImpl(EntityManager em) {
		this.em = em;
		this.idDAO = new GenericDAOImpl<Identification>(em) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		};
		this.idHistoryDAO = new GenericDAOImpl<IdentificationsHistory>(em) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		};
	}

	public Identification create(Identification entity) {
		return idDAO.create(entity);
	}

	public Identification update(Identification entity) {
		return idDAO.update(entity);
	}

	public void delete(Identification entity) {
		idDAO.delete(entity);
	}

	public void refresh(Identification entity) {
		idDAO.refresh(entity);
	}

	public IdentificationsHistory create(IdentificationsHistory entity) {
		return idHistoryDAO.create(entity);
	}

	public IdentificationsHistory update(IdentificationsHistory entity) {
		return idHistoryDAO.update(entity);
	}

	public void delete(IdentificationsHistory entity) {
		idHistoryDAO.delete(entity);
	}

	public void refresh(IdentificationsHistory entity) {
		idHistoryDAO.refresh(entity);
	}

	public void fix(Identification id, List<Identification> ids) {

		if(id == null){
			logger.log(Level.SEVERE, "fix with id=null");
			return;
		}
		
		// Auxiliar para recorrer
		IdentificationsHistory idH;

		// Cargo para que quede en el contexto de persistencia
		id = this.getIdentificationById(id.getId());
		
		Person person = id.getPerson();
		Person personToDelete;
		
		INotificationPersonDAO notificationDAO = new NotificationPersonDAOImpl(em);
		IUserDAO userDAO = new UserDAOImpl(em);
		IPersonDAO personDAO = new PersonDAOImpl(em);
		IPersonRecordDAO personRecordDAO = new PersonRecordDAOImpl(em);

		// Para cada id de los que tengo que arreglar
		for (Identification idToFix : ids) {

			// Si no es el id que elegi
			if (id.getId() != idToFix.getId()) {
				
				// Cargo para que quede en el contexto de persistencia
				idToFix = this.getIdentificationById(idToFix.getId());
				
				personToDelete = idToFix.getPerson();

				// Actualizo los personrecords asociados al id que elegi
//				for (PersonsRecord record : idToFix.getPersonsRecords()) { 12-12-2015 change bruno
				for (PersonsRecord record : personRecordDAO.getCDAsIdentificationId(idToFix.getId())) {
//					record.setIdentification(id); 12-12-2015 change bruno
					record.setIdentificationRef(CryptoConverter.encrypt(idToFix.getId().toString()));
				}
				
				// Actualizo los notificationsPersons asociados al id que elegi
				for (NotificationsPerson np : personToDelete.getNotificationsPersons()) {
					np.setPerson(person);
					notificationDAO.update(np);
				}
				
				// Actualizo los usuarios asociados al id que elegi
				for (User u : personToDelete.getUsers()) {
					u.setPerson(person);
					userDAO.update(u);
				}

				// Obtengo el id historico
				idH = this.getIdentificationsHistoryByCode(idToFix.getIdentificacionCode());

				// si no esta, lo creo y lo guardo
				if (idH == null) {
					idH = new IdentificationsHistory();
					idH.setIdentificationCode(idToFix.getIdentificacionCode());
					idH.setIdentification(id);
					this.create(idH);

				// si esta, actualizo el id de referencia por las dudas
				} else {
					idH.setIdentification(id);
					this.update(idH);
				}

				// borrar identification y persona
				
				if(person.getId() != personToDelete.getId()){
					this.delete(idToFix);
					personDAO.delete(personToDelete);
				}else{
					this.delete(idToFix);
				}
				

			}

		}

	}

	public Identification getIdentificationById(Long id) {
		return em.find(Identification.class, id);
	}

	public Identification getIdentificationByCode(String code) {

		Query q = em.createNamedQuery("Identification.findByCode");
		q.setParameter("code", code);
		List<?> rest = q.getResultList();
		return rest == null || rest.isEmpty() ? null : (Identification) rest.get(0);
		
	}

	public IdentificationsHistory getIdentificationsHistoryById(Long id) {
		return em.find(IdentificationsHistory.class, id);
	}

	public IdentificationsHistory getIdentificationsHistoryByCode(String code) {
		Query q = em.createNamedQuery("IdentificationsHistory.findByCode");
		q.setParameter("code", code);
		List<?> rest = q.getResultList();
		return rest == null || rest.isEmpty() ? null : (IdentificationsHistory) rest.get(0);
	}
	
	public void fixIdentifiersWithDatabase(Identification id, List<Identification> ids){
	
		
	}

}
