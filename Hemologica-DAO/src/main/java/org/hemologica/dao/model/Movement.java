package org.hemologica.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	
	@NotNull
	@Column(name="movement_date", nullable=false)
	private Date date;



	//bi-directional many-to-one association to MovementsType
	@ManyToOne
	@JoinColumn(name="movements_types_id")
	private MovementsType movementsType;

	//bi-directional many-to-one association to Service
	
	@ManyToOne
	@JoinColumn(name="movement_id")
	private Center center;

	//bi-directional many-to-one association to Unit
	@ManyToOne
	@JoinColumn(name="units_id")
	private Unit unit;

	public Movement() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MovementsType getMovementsType() {
		return this.movementsType;
	}

	public void setMovementsType(MovementsType movementsType) {
		this.movementsType = movementsType;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}