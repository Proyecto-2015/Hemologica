package org.hemologica.model;

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
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Advertisment
	@ManyToOne
	@JoinColumn(name="advertisments_id", nullable=false)
	private Advertisment advertisment;

	public AdvertismentsContent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Advertisment getAdvertisment() {
		return this.advertisment;
	}

	public void setAdvertisment(Advertisment advertisment) {
		this.advertisment = advertisment;
	}

}