package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the countries_codes database table.
 * 
 */
@Entity
@Table(name="countries_codes")
@NamedQueries({
@NamedQuery(name="CountriesCode.findAll", query="SELECT c FROM CountriesCode c"),
@NamedQuery(name="CountriesCode.findByCode", query="SELECT d FROM CountriesCode d WHERE d.countryCodeValue = :code")
})
public class CountriesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="country_code_label")
	private String countryCodeLabel;

	@Column(name="country_code_value")
	private String countryCodeValue;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="countriesCode")
	private List<Document> documents;

	//bi-directional many-to-one association to StatesCode
	@OneToMany(mappedBy="countriesCode")
	private List<StatesCode> statesCodes;

	public CountriesCode() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getCountryCodeLabel() {
		return countryCodeLabel;
	}

	public void setCountryCodeLabel(String countryCodeLabel) {
		this.countryCodeLabel = countryCodeLabel;
	}

	public String getCountryCodeValue() {
		return countryCodeValue;
	}

	public void setCountryCodeValue(String countryCodeValue) {
		this.countryCodeValue = countryCodeValue;
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