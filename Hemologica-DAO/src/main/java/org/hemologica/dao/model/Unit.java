package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the units database table.
 * 
 */
@Entity
@Table(name="units")
@NamedQuery(name="Unit.findAll", query="SELECT u FROM Unit u")
public class Unit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="unit_institution_code")
	private String unitInstitutionCode;

	@Column(name="unit_uuid")
	private String unitUuid;

	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="unit")
	private List<Movement> movements;

	//bi-directional many-to-one association to Institution
	@ManyToOne
	@JoinColumn(name="unit_institution_id")
	private Institution institution;

	//bi-directional many-to-one association to Center
	@ManyToOne
	@JoinColumn(name="unit_institution_center_id")
	private Center center;

	//bi-directional many-to-one association to UnitsType
	@ManyToOne
	@JoinColumn(name="unit_type")
	private UnitsType unitsType;

	public Unit() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUnitInstitutionCode() {
		return this.unitInstitutionCode;
	}

	public void setUnitInstitutionCode(String unitInstitutionCode) {
		this.unitInstitutionCode = unitInstitutionCode;
	}

	public String getUnitUuid() {
		return this.unitUuid;
	}

	public void setUnitUuid(String unitUuid) {
		this.unitUuid = unitUuid;
	}

	public List<Movement> getMovements() {
		return this.movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public Movement addMovement(Movement movement) {
		getMovements().add(movement);
		movement.setUnit(this);

		return movement;
	}

	public Movement removeMovement(Movement movement) {
		getMovements().remove(movement);
		movement.setUnit(null);

		return movement;
	}

	public Institution getInstitution() {
		return this.institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public Center getCenter() {
		return this.center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	public UnitsType getUnitsType() {
		return this.unitsType;
	}

	public void setUnitsType(UnitsType unitsType) {
		this.unitsType = unitsType;
	}

}