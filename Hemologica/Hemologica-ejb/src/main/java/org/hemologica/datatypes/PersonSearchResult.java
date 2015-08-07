/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author bruno
 */
public class PersonSearchResult implements Serializable{
	
	private List<PersonSearchResultItem> items;

	
	/**
	 * @return the items
	 */
	public List<PersonSearchResultItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<PersonSearchResultItem> items) {
		this.items = items;
	}
}
