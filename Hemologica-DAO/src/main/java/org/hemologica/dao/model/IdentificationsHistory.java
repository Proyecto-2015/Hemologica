package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the identifications_history database table.
 * 
 */
@Entity
@Table(name="identifications_history")
@NamedQueries(value={
		@NamedQuery(name="IdentificationsHistory.findAll", query="SELECT i FROM IdentificationsHistory i"),
		@NamedQuery(name="IdentificationsHistory.findById", query="SELECT i FROM IdentificationsHistory i WHERE i.id = :id"),
		@NamedQuery(name="IdentificationsHistory.findByCode", query="SELECT i FROM IdentificationsHistory i WHERE i.identificationCode = :code")
})

public class IdentificationsHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="identification_code")
	private String identificationCode;

	//bi-directional many-to-one association to Identification
	@ManyToOne
	private Identification identification;

	public IdentificationsHistory() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificationCode() {
		return this.identificationCode;
	}

	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}

	public Identification getIdentification() {
		return this.identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

}