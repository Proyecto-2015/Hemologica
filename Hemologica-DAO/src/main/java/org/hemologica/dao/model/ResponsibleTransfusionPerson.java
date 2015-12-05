package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the persons database table.
 * 
 */
@Entity
@Table(name="responsible_transfusion_person")
@NamedQueries({
@NamedQuery(name="ResponsibleTransfusionPerson.findAll", query="SELECT p FROM ResponsibleTransfusionPerson p"),
@NamedQuery(name="ResponsibleTransfusionPerson.getResponsibleByCenter", query="SELECT i FROM ResponsibleTransfusionPerson i WHERE i.center.centerCode = :code")
})
public class ResponsibleTransfusionPerson implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="person")
	private Person person;

	@ManyToOne
	@JoinColumn(name="person_center")
	private Center center;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}
	
}