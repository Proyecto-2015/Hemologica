package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the states_codes database table.
 * 
 */
@Entity
@Table(name="states_codes")
@NamedQuery(name="StatesCode.findAll", query="SELECT s FROM StatesCode s")
public class StatesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="state_id")
	private int stateId;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="state_display_name")
	private String stateDisplayName;

	//bi-directional many-to-one association to CitiesCode
	@OneToMany(mappedBy="statesCode")
	private List<CitiesCode> citiesCodes;

	//bi-directional many-to-one association to CountriesCode
	@ManyToOne
	@JoinColumn(name="state_country")
	private CountriesCode countriesCode;

	public StatesCode() {
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateDisplayName() {
		return this.stateDisplayName;
	}

	public void setStateDisplayName(String stateDisplayName) {
		this.stateDisplayName = stateDisplayName;
	}

	public List<CitiesCode> getCitiesCodes() {
		return this.citiesCodes;
	}

	public void setCitiesCodes(List<CitiesCode> citiesCodes) {
		this.citiesCodes = citiesCodes;
	}

	public CitiesCode addCitiesCode(CitiesCode citiesCode) {
		getCitiesCodes().add(citiesCode);
		citiesCode.setStatesCode(this);

		return citiesCode;
	}

	public CitiesCode removeCitiesCode(CitiesCode citiesCode) {
		getCitiesCodes().remove(citiesCode);
		citiesCode.setStatesCode(null);

		return citiesCode;
	}

	public CountriesCode getCountriesCode() {
		return this.countriesCode;
	}

	public void setCountriesCode(CountriesCode countriesCode) {
		this.countriesCode = countriesCode;
	}

}