package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the advertisments_contents database table.
 * 
 */
@Entity
@Table(name="advertisments_contents")
@NamedQuery(name="AdvertismentsContent.findAll", query="SELECT a FROM AdvertismentsContent a")
public class AdvertismentsContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//bi-directional many-to-one association to Advertisment
	@ManyToOne
	@JoinColumn(name="advertisments_id")
	private Advertisment advertisment;

	public AdvertismentsContent() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Advertisment getAdvertisment() {
		return this.advertisment;
	}

	public void setAdvertisment(Advertisment advertisment) {
		this.advertisment = advertisment;
	}

}