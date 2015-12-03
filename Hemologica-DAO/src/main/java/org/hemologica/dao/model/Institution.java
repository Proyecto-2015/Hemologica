package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the institutions database table.
 * 
 */
@Entity
@Table(name="institutions")
@NamedQueries({
@NamedQuery(name="Institution.findAll", query="SELECT i FROM Institution i"),
@NamedQuery(name="Institution.getInstitutionCode", query="SELECT i FROM Institution i where i.institutionCode = :code")
})
public class Institution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="institution_code")
	private String institutionCode;

	@Column(name="institution_display_name")
	private String institutionDisplayName;

	@Column(name="institution_oid")
	private String institutionOid;

	//bi-directional many-to-one association to Center
	@OneToMany(mappedBy="institution")
	private List<Center> centers;

	//bi-directional many-to-one association to Unit
	@OneToMany(mappedBy="institution")
	private List<Unit> units;

	public Institution() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstitutionCode() {
		return this.institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getInstitutionDisplayName() {
		return this.institutionDisplayName;
	}

	public void setInstitutionDisplayName(String institutionDisplayName) {
		this.institutionDisplayName = institutionDisplayName;
	}

	public String getInstitutionOid() {
		return this.institutionOid;
	}

	public void setInstitutionOid(String institutionOid) {
		this.institutionOid = institutionOid;
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

	public List<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}


}