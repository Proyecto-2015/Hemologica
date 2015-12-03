package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the movements_types database table.
 * 
 */
@Entity
@Table(name="movements_types")
@NamedQueries(value={
		@NamedQuery(name="MovementsType.findAll", query="SELECT m FROM MovementsType m"),
		@NamedQuery(name="MovementsType.findByCode", query="SELECT m FROM MovementsType m WHERE m.code = :code")
})

public class MovementsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(columnDefinition="movement_type_code")
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="movementsType")
	private List<Movement> movements;

	public MovementsType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Movement> getMovements() {
		return this.movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public Movement addMovement(Movement movement) {
		getMovements().add(movement);
		movement.setMovementsType(this);

		return movement;
	}

	public Movement removeMovement(Movement movement) {
		getMovements().remove(movement);
		movement.setMovementsType(null);

		return movement;
	}

}