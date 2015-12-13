package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cities_codes database table.
 * 
 */
@Entity
@Table(name="cities_codes")
@NamedQueries({
@NamedQuery(name="CitiesCode.findAll", query="SELECT c FROM CitiesCode c"),
@NamedQuery(name="CitiesCode.getCitiesByStateCode", query="SELECT c FROM CitiesCode c WHERE c.statesCode.stateCode = :code"),
@NamedQuery(name="CitiesCode.getCitiesByCode", query="SELECT c FROM CitiesCode c WHERE c.cityCode = :code")
})
public class CitiesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	private Long cityId;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="city_display_name")
	private String cityDisplayName;

	//bi-directional many-to-one association to StatesCode
	@ManyToOne
	@JoinColumn(name="city_state_id")
	private StatesCode statesCode;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="citiesCode")
	private List<Person> persons;

	public CitiesCode() {
	}

	public Long getCityId() {
		return this.cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityDisplayName() {
		return this.cityDisplayName;
	}

	public void setCityDisplayName(String cityDisplayName) {
		this.cityDisplayName = cityDisplayName;
	}

	public StatesCode getStatesCode() {
		return this.statesCode;
	}

	public void setStatesCode(StatesCode statesCode) {
		this.statesCode = statesCode;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setCitiesCode(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setCitiesCode(null);

		return person;
	}

}