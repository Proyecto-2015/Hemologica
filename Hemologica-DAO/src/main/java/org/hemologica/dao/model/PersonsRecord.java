package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the persons_records database table.
 * 
 */
@Entity
@Table(name="persons_records")
@NamedQueries(value={
	@NamedQuery(name="PersonsRecord.findAll", query="SELECT p FROM PersonsRecord p"),
	@NamedQuery(name="PersonsRecord.findByIdentificationCode", query="SELECT p FROM PersonsRecord p WHERE p.identification.identificacionCode = :id")
})
public class PersonsRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="persons_record_cda_root")
	private String personsRecordCdaRoot;
	
	@Column(name="persons_record_cda_extension")
	private String personsRecordCdaExtension;

	//bi-directional many-to-one association to Identification
	@ManyToOne
	@JoinColumn(name="identifications_id")
	private Identification identification;
	
//	@Convert(
//			attributeName="identification",
//			converter=org.hemologica.dao.converter.CryptoConverter.class
//			)
	

	public PersonsRecord() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonsRecordCdaRoot() {
		return personsRecordCdaRoot;
	}

	public void setPersonsRecordCdaRoot(String personsRecordCdaRoot) {
		this.personsRecordCdaRoot = personsRecordCdaRoot;
	}

	public String getPersonsRecordCdaExtension() {
		return personsRecordCdaExtension;
	}

	public void setPersonsRecordCdaExtension(String personsRecordCdaExtension) {
		this.personsRecordCdaExtension = personsRecordCdaExtension;
	}

	public Identification getIdentification() {
		return this.identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

}