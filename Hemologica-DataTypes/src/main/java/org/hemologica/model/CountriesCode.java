package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="countriesCode")
	private List<Document> documents;

	//bi-directional many-to-one association to StatesCode
	@OneToMany(mappedBy="countriesCode")
	private List<StatesCode> statesCodes;

	public CountriesCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setCountriesCode(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setCountriesCode(null);

		return document;
	}

	public List<StatesCode> getStatesCodes() {
		return this.statesCodes;
	}

	public void setStatesCodes(List<StatesCode> statesCodes) {
		this.statesCodes = statesCodes;
	}

	public StatesCode addStatesCode(StatesCode statesCode) {
		getStatesCodes().add(statesCode);
		statesCode.setCountriesCode(this);

		return statesCode;
	}

	public StatesCode removeStatesCode(StatesCode statesCode) {
		getStatesCodes().remove(statesCode);
		statesCode.setCountriesCode(null);

		return statesCode;
	}

}