package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transfusion_events_codes database table.
 * 
 */
@Entity
@Table(name="transfusion_events_codes")
@NamedQueries({
@NamedQuery(name="TransfusionEventsCode.findAll", query="SELECT t FROM TransfusionEventsCode t"),
@NamedQuery(name="TransfusionEventsCode.findBySnomedCode", query="SELECT d FROM TransfusionEventsCode d WHERE d.concept.conceptCode = :code"),
@NamedQuery(name="TransfusionEventsCode.findById", query="SELECT d FROM TransfusionEventsCode d WHERE d.transfusionEventCodeValue = :code")
})

public class TransfusionEventsCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transfusion_event_code_id")
	private Long transfusionEventCodeId;

	@Column(name="transfusion_event_code_label")
	private String transfusionEventCodeLabel;

	@Column(name="transfusion_event_code_value")
	private String transfusionEventCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="transfusion_event_code_snomed")
	private Concept concept;

	public TransfusionEventsCode() {
	}

	public Long getTransfusionEventCodeId() {
		return this.transfusionEventCodeId;
	}

	public void setTransfusionEventCodeId(Long transfusionEventCodeId) {
		this.transfusionEventCodeId = transfusionEventCodeId;
	}

	public String getTransfusionEventCodeLabel() {
		return this.transfusionEventCodeLabel;
	}

	public void setTransfusionEventCodeLabel(String transfusionEventCodeLabel) {
		this.transfusionEventCodeLabel = transfusionEventCodeLabel;
	}

	public String getTransfusionEventCodeValue() {
		return this.transfusionEventCodeValue;
	}

	public void setTransfusionEventCodeValue(String transfusionEventCodeValue) {
		this.transfusionEventCodeValue = transfusionEventCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}