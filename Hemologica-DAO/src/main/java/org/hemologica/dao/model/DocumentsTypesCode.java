package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the documents_types_codes database table.
 * 
 */
@Entity
@Table(name="documents_types_codes")
@NamedQuery(name="DocumentsTypesCode.findAll", query="SELECT d FROM DocumentsTypesCode d")
public class DocumentsTypesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="documents_type_code_label")
	private String documentsTypeCodeLabel;

	@Column(name="documents_type_code_value")
	private String documentsTypeCodeValue;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="documentsTypesCode")
	private List<Document> documents;

	public DocumentsTypesCode() {
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

	public String getDocumentsTypeCodeLabel() {
		return documentsTypeCodeLabel;
	}

	public void setDocumentsTypeCodeLabel(String documentsTypeCodeLabel) {
		this.documentsTypeCodeLabel = documentsTypeCodeLabel;
	}

	public String getDocumentsTypeCodeValue() {
		return documentsTypeCodeValue;
	}

	public void setDocumentsTypeCodeValue(String documentsTypeCodeValue) {
		this.documentsTypeCodeValue = documentsTypeCodeValue;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setDocumentsTypesCode(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setDocumentsTypesCode(null);

		return document;
	}
	

}