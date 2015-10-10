package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the concepts database table.
 * 
 */
@Entity
@Table(name="concepts")
@NamedQuery(name="Concept.findAll", query="SELECT c FROM Concept c")
public class Concept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to ConceptsDisplay
	@OneToMany(mappedBy="concept")
	private List<ConceptsDisplay> conceptsDisplays;

	public Concept() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ConceptsDisplay> getConceptsDisplays() {
		return this.conceptsDisplays;
	}

	public void setConceptsDisplays(List<ConceptsDisplay> conceptsDisplays) {
		this.conceptsDisplays = conceptsDisplays;
	}

	public ConceptsDisplay addConceptsDisplay(ConceptsDisplay conceptsDisplay) {
		getConceptsDisplays().add(conceptsDisplay);
		conceptsDisplay.setConcept(this);

		return conceptsDisplay;
	}

	public ConceptsDisplay removeConceptsDisplay(ConceptsDisplay conceptsDisplay) {
		getConceptsDisplays().remove(conceptsDisplay);
		conceptsDisplay.setConcept(null);

		return conceptsDisplay;
	}

}