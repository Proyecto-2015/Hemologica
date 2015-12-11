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
@NamedQueries(value={
	@NamedQuery(name="Unit.findAll", query="SELECT u FROM Unit u"),
	@NamedQuery(name="Unit.findByInstitutionCode", query="SELECT u FROM Unit u WHERE u.unitInstitutionCode = :code"),
	@NamedQuery(name="Unit.findByUUID", query="SELECT u FROM Unit u WHERE u.unitUuid = :uuid"),
})
public class Unit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="unit_institution_code")
	private String unitInstitutionCode;

	@Column(name="unit_uuid")
	private String unitUuid;
	
	@Column(name="unit_state")
	private Boolean active; 

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="unit")
	private List<Movement> movements;

	//bi-directional many-to-one association to Center
	@ManyToOne
	@JoinColumn(name="unit_institution_center_id")
	private Center center;

	//bi-directional many-to-one association to UnitsType
	@ManyToOne
	@JoinColumn(name="unit_type")
	private UnitsType unitsType;
	
	
	@ManyToOne
	@JoinColumn(name="blood_type")
	private BloodTypes bloodType;
	
	
	@ManyToOne
	@JoinColumn(name="unit_parent")
	private Unit unitParent;


	public Unit getUnitParent() {
		return unitParent;
	}

	public void setUnitParent(Unit unitParent) {
		this.unitParent = unitParent;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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
	
		public BloodTypes getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodTypes bloodType) {
		this.bloodType = bloodType;
	}

}