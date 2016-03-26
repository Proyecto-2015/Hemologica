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
//	@NamedQuery(name="PersonsRecord.findByIdentificationCode", query="SELECT p FROM PersonsRecord p WHERE p.identification.identificacionCode = :id"),
//	@NamedQuery(name="PersonsRecord.findByPersonId", query="SELECT p FROM PersonsRecord p WHERE p.identification.person.id = :id"),
	@NamedQuery(name="PersonsRecord.findByIdentificationRefCode", query="SELECT p FROM PersonsRecord p WHERE p.identificationRef = :id"),
	@NamedQuery(name="PersonsRecord.findByIdentificationRefCodes", query="SELECT p FROM PersonsRecord p WHERE p.identificationRef in (:ids)"),
	@NamedQuery(name="PersonsRecord.findByRootExtension", query="SELECT p FROM PersonsRecord p WHERE p.personsRecordCdaRoot = :root AND p.personsRecordCdaExtension = :extension")
})
@NamedNativeQueries(value={
	@NamedNativeQuery(name="PersonsRecord.getCoutDistintics", query="select count(1) from ( select count(1), person_record_identification_id from persons_records r where (persons_record_cda_extension, persons_record_cda_root) in (:ids) group by person_record_identification_id ) as cdas ")
		
})
public class PersonsRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="persons_record_cda_root")
	private String personsRecordCdaRoot;
	
	@Column(name="persons_record_cda_extension")
	private String personsRecordCdaExtension;

	//bi-directional many-to-one association to Identification
//	@ManyToOne
//	@JoinColumn(name="identifications_id")
//	private Identification identification;
	
	@Column(name="person_record_identification_id")
	private String identificationRef;

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

//	public Identification getIdentification() {
//		return this.identification;
//	}
//
//	public void setIdentification(Identification identification) {
//		this.identification = identification;
//	}

	public String getIdentificationRef() {
		return identificationRef;
	}

	public void setIdentificationRef(String identificationRef) {
		this.identificationRef = identificationRef;
	}

}