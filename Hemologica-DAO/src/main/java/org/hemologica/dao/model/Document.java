package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the documents database table.
 * 
 */
@Entity
@Table(name="documents")
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="document_id")
	private Long documentId;

	@Column(name="document_number")
	private String documentNumber;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="document_person_id")
	private Person person;

	//bi-directional many-to-one association to CountriesCode
	@ManyToOne
	@JoinColumn(name="document_country")
	private CountriesCode countriesCode;

	//bi-directional many-to-one association to DocumentsTypesCode
	@ManyToOne
	@JoinColumn(name="document_type")
	private DocumentsTypesCode documentsTypesCode;

	public Document() {
	}

	public Long getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getDocumentNumber() {
		return this.documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public CountriesCode getCountriesCode() {
		return this.countriesCode;
	}

	public void setCountriesCode(CountriesCode countriesCode) {
		this.countriesCode = countriesCode;
	}

	public DocumentsTypesCode getDocumentsTypesCode() {
		return this.documentsTypesCode;
	}

	public void setDocumentsTypesCode(DocumentsTypesCode documentsTypesCode) {
		this.documentsTypesCode = documentsTypesCode;
	}

}