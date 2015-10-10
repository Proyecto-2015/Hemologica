package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the persons_records database table.
 * 
 */
@Entity
@Table(name="persons_records")
@NamedQuery(name="PersonsRecord.findAll", query="SELECT p FROM PersonsRecord p")
public class PersonsRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private String id;

	//bi-directional many-to-one association to Identification
	@ManyToOne
	@JoinColumn(name="identifications_id", nullable=false)
	private Identification identification;

	public PersonsRecord() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Identification getIdentification() {
		return this.identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

}