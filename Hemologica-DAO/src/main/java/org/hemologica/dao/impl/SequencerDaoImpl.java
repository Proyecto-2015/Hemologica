package org.hemologica.dao.impl;

import javax.persistence.EntityManager;

import org.hemologica.dao.ISequencerDAO;
import org.hemologica.dao.model.Sequencer;

public class SequencerDaoImpl extends GenericDAOImpl<Sequencer> implements ISequencerDAO{


	private static final long serialVersionUID = 1L;

	public SequencerDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
