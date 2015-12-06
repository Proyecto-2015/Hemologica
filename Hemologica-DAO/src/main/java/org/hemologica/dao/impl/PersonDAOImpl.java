package org.hemologica.dao.impl;

import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.model.Person;

public class PersonDAOImpl extends GenericDAOImpl<Person> implements IPersonDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7889754275874936595L;
	
	public PersonDAOImpl(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersonsFilters(HashMap<String, Object> whereFilters) {
		
		String queryString = "SELECT p FROM Person p";
		if(whereFilters!= null && whereFilters.size()!=0){
			queryString += " WHERE ";
			
			boolean first=false;
			for(String key :whereFilters.keySet()){
				if(first)
					queryString+="p." + key + "=%" + whereFilters.get(key)+"%";
				else
					queryString+="and p." + key + "=%" + whereFilters.get(key)+"%";
				
			}
		}
		
		Query query = em.createQuery(queryString,Person.class);
		return (List<Person>) query.getResultList();

	}

	public Person getPersonsId(Long id) {
		
		Query query = em.createNamedQuery("Person.findById");
		query.setParameter("id", id);
		return (Person) query.getSingleResult();
		
	}

}
