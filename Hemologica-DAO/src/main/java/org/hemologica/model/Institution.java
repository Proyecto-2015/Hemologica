package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the institutions database table.
 * 
 */
@Entity
@Table(name="institutions")
@NamedQuery(name="Institution.findAll", query="SELECT i FROM Institution i")
public class Institution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Center
	@OneToMany(mappedBy="institution")
	private List<Center> centers;

	public Institution() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Center> getCenters() {
		return this.centers;
	}

	public void setCenters(List<Center> centers) {
		this.centers = centers;
	}

	public Center addCenter(Center center) {
		getCenters().add(center);
		center.setInstitution(this);

		return center;
	}

	public Center removeCenter(Center center) {
		getCenters().remove(center);
		center.setInstitution(null);

		return center;
	}

}