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
@NamedQueries(value={
	@NamedQuery(name="Movement.findAll", query="SELECT m FROM Movement m"),
	@NamedQuery(name="Movement.getAllByUnitSortedByDate", query="SELECT m FROM Movement m WHERE m.unit.id = :unitId ORDER BY m.date DESC")
})
public class Movement implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@NotNull
	@Column(name="movement_date", nullable=false)
	private Date date;


	//bi-directional many-to-one association to MovementsType
	@ManyToOne
	@JoinColumn(name="movements_types_id")
	private MovementsType movementsType;

	//bi-directional many-to-one association to Service
	
	@ManyToOne
	@JoinColumn(name="movement_center")
	private Center center;

	//bi-directional many-to-one association to Unit
	@ManyToOne
	@JoinColumn(name="units_id")
	private Unit unit;

	public Movement() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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