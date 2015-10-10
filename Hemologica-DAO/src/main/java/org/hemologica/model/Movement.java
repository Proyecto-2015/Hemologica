package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the movements database table.
 * 
 */
@Entity
@Table(name="movements")
@NamedQuery(name="Movement.findAll", query="SELECT m FROM Movement m")
public class Movement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private String id;

	//bi-directional many-to-one association to Service
	@ManyToOne
	@JoinColumn(name="services_id", nullable=false)
	private Service service;

	//bi-directional many-to-one association to Unit
	@ManyToOne
	@JoinColumn(name="units_id", nullable=false)
	private Unit unit;

	//bi-directional many-to-one association to MovementsType
	@ManyToOne
	@JoinColumn(name="movements_types_id", nullable=false)
	private MovementsType movementsType;

	public Movement() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public MovementsType getMovementsType() {
		return this.movementsType;
	}

	public void setMovementsType(MovementsType movementsType) {
		this.movementsType = movementsType;
	}

}