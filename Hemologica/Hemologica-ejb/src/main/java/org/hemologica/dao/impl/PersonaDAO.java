/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import org.hemologica.dao.AbstractDAO;
import org.hemologica.datatypes.PersonSearchFilter;
import org.hemologica.datatypes.PersonSearchResult;
import org.hemologica.entities.Person;

/**
 *
 * @author bruno
 */
public class PersonaDAO extends AbstractDAO<Person>{

	public PersonaDAO(EntityManager em, Class<Person> entity, String user, String source) {
		super(em, entity, user, source);
	}
	
	public List<PersonSearchResult> search(PersonSearchFilter filter){
		//TODO
		return null;
	}
	
}
