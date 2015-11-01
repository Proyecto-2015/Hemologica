package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the units_types database table.
 * 
 */
@Entity
@Table(name="units_types")
@NamedQuery(name="UnitsType.findAll", query="SELECT u FROM UnitsType u")
public class UnitsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="unit_type_id")
	private int unitTypeId;

	@Column(name="unit_type_code")
	private String unitTypeCode;

	@Column(name="unit_type_display")
	private String unitTypeDisplay;

	//bi-directional many-to-one association to Unit
	@OneToMany(mappedBy="unitsType")
	private List<Unit> units;

	public UnitsType() {
	}

	public int getUnitTypeId() {
		return this.unitTypeId;
	}

	public void setUnitTypeId(int unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getUnitTypeCode() {
		return this.unitTypeCode;
	}

	public void setUnitTypeCode(String unitTypeCode) {
		this.unitTypeCode = unitTypeCode;
	}

	public String getUnitTypeDisplay() {
		return this.unitTypeDisplay;
	}

	public void setUnitTypeDisplay(String unitTypeDisplay) {
		this.unitTypeDisplay = unitTypeDisplay;
	}

	public List<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public Unit addUnit(Unit unit) {
		getUnits().add(unit);
		unit.setUnitsType(this);

		return unit;
	}

	public Unit removeUnit(Unit unit) {
		getUnits().remove(unit);
		unit.setUnitsType(null);

		return unit;
	}

}