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
@NamedQueries({
@NamedQuery(name="UnitsType.findAll", query="SELECT u FROM UnitsType u"),
@NamedQuery(name="UnitsType.findBySnomedCode", query="SELECT d FROM UnitsType d WHERE d.concept.conceptCode = :code"),
@NamedQuery(name="UnitsType.findById", query="SELECT d FROM UnitsType d WHERE d.unitTypeCodeValue = :code")
})
public class UnitsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="unit_type_id")
	private Long unitTypeId;

	@Column(name="unit_type_code_label")
	private String unitTypeCodeLabel;

	@Column(name="unit_type_code_value")
	private String unitTypeCodeValue;
	
	@ManyToOne
	@JoinColumn(name="unit_type_code_snomed")
	private Concept concept;

	//bi-directional many-to-one association to Unit
	@OneToMany(mappedBy="unitsType")
	private List<Unit> units;

	public UnitsType() {
	}

	public Long getUnitTypeId() {
		return this.unitTypeId;
	}

	public void setUnitTypeId(Long unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getUnitTypeCodeLabel() {
		return unitTypeCodeLabel;
	}

	public void setUnitTypeCodeLabel(String unitTypeCodeLabel) {
		this.unitTypeCodeLabel = unitTypeCodeLabel;
	}

	public String getUnitTypeCodeValue() {
		return unitTypeCodeValue;
	}

	public void setUnitTypeCodeValue(String unitTypeCodeValue) {
		this.unitTypeCodeValue = unitTypeCodeValue;
	}

	public List<Unit> getUnits() {
		return this.units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
//	public Unit addUnit(Unit unit) {
//		getUnits().add(unit);
//		unit.setUnitsType(this);
//
//		return unit;
//	}
//
//	public Unit removeUnit(Unit unit) {
//		getUnits().remove(unit);
//		unit.setUnitsType(null);
//
//		return unit;
//	}

}