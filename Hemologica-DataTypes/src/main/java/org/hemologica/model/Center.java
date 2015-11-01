package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the centers database table.
 * 
 */
@Entity
@Table(name="centers")
@NamedQuery(name="Center.findAll", query="SELECT c FROM Center c")
public class Center implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="center_code")
	private String centerCode;

	@Column(name="center_display_name")
	private String centerDisplayName;

	@Column(name="center_oid")
	private String centerOid;

	//bi-directional many-to-one association to GeoLocation
	@ManyToOne
	@JoinColumn(name="center_location")
	private GeoLocation geoLocation;

	//bi-directional many-to-one association to Institution
	@ManyToOne
	@JoinColumn(name="center_institution_id")
	private Institution institution;

	//bi-directional many-to-one association to Unit
	@OneToMany(mappedBy="center")
	private List<Unit> units;

	public Center() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCenterDisplayName() {
		return this.centerDisplayName;
	}

	public void setCenterDisplayName(String centerDisplayName) {
		this.centerDisplayName = centerDisplayName;
	}

	public String getCenterOid() {
		return this.centerOid;
	}

	public void setCenterOid(String centerOid) {
		this.centerOid = centerOid;
	}

	public GeoLocation getGeoLocation() {
		return this.geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Institution getInstitution() {
		return this.institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public List<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public Unit addUnit(Unit unit) {
		getUnits().add(unit);
		unit.setCenter(this);

		return unit;
	}

	public Unit removeUnit(Unit unit) {
		getUnits().remove(unit);
		unit.setCenter(null);

		return unit;
	}

}