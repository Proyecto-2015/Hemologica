package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


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
	@Column(unique=true, nullable=false)
	private int id;

	public DocumentsTypesCode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}