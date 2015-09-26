package org.hemologica.salud.ejb.beans.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.hemologica.salud.ejb.beans.DonationBeanLocal;


public class DonationBean implements DonationBeanLocal, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7445567749832049675L;

    private EntityManager em;
	
}
