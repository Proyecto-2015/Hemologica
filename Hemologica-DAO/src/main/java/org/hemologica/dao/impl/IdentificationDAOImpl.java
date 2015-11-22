package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hemologica.dao.IGenericDAO;
import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.IdentificationsHistory;
import org.hemologica.dao.model.Person;

public class IdentificationDAOImpl implements IIdentificationDAO {

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

	}

	public Identification getIdentificationById(Integer id) {
		// TODO
		return null;
	}

	public Identification getIdentificationByCode(String code) {
		// TODO
		return null;
	}

	public IdentificationsHistory getIdentificationsHistoryById(Integer id) {
		// TODO
		return null;
	}

	public IdentificationsHistory getIdentificationsHistoryByCode(String code) {
		// TODO
		return null;
	}

}
