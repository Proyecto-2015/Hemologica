/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.datatypes;

import java.io.Serializable;
import org.hemologica.entities.Person;

/**
 *
 * @author bruno
 */
public class PersonSearchResultItem implements Serializable{
	
	private Person person;

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
