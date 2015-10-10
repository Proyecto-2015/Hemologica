package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the countries_codes database table.
 * 
 */
@Entity
@Table(name="countries_codes")
@NamedQuery(name="CountriesCode.findAll", query="SELECT c FROM CountriesCode c")
public class CountriesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	public CountriesCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}