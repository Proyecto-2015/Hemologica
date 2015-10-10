package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the concepts_displays database table.
 * 
 */
@Entity
@Table(name="concepts_displays")
@NamedQuery(name="ConceptsDisplay.findAll", query="SELECT c FROM ConceptsDisplay c")
public class ConceptsDisplay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="concepts_id", nullable=false)
	private Concept concept;

	public ConceptsDisplay() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}