package org.hemologica.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="results_code")
@NamedQueries({
@NamedQuery(name="ResultsCode.findAll", query="SELECT d FROM ResultsCode d"),
@NamedQuery(name="ResultsCode.findById", query="SELECT d FROM ResultsCode d WHERE d.resultsCodeValue = :code"),
@NamedQuery(name="ResultsCode.findBySnomedCode", query="SELECT d FROM ResultsCode d WHERE d.concept.conceptCode = :code"),
@NamedQuery(name="ResultsCode.findSnomedCodeByBooleanCode", query="SELECT d FROM ResultsCode d WHERE d.booleanValue = :code")
})
public class ResultsCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="results_code_id")
	private Long resultsCodeId;

	@Column(name="results_code_label")
	private String resultsCodeLabel;

	@Column(name="results_code_value")
	private String resultsCodeValue;
	
	@Column(name="boolean_results_code_value")
	private boolean booleanValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="results_code_snomed")
	private Concept concept;

	public Long getResultsCodeId() {
		return resultsCodeId;
	}

	public void setResultsCodeId(Long resultsCodeId) {
		this.resultsCodeId = resultsCodeId;
	}

	public String getResultsCodeLabel() {
		return resultsCodeLabel;
	}

	public void setResultsCodeLabel(String resultsCodeLabel) {
		this.resultsCodeLabel = resultsCodeLabel;
	}

	public String getResultsCodeValue() {
		return resultsCodeValue;
	}

	public void setResultsCodeValue(String resultsCodeValue) {
		this.resultsCodeValue = resultsCodeValue;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

	public boolean isBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

}
