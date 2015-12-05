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
@Table(name="event_severity_code")
@NamedQueries({
@NamedQuery(name="EventSeverityCode.findAll", query="SELECT d FROM EventSeverityCode d"),
@NamedQuery(name="EventSeverityCode.findBySnomedCode", query="SELECT c FROM EventSeverityCode c WHERE c.concept.conceptCode = :code "),
@NamedQuery(name="EventSeverityCode.findById", query="SELECT c FROM EventSeverityCode c WHERE c.eventSeverityCodeValue = :code ")
})
public class EventSeverityCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="event_severity_code_id")
	private Long eventSeverityCodeId;

	@Column(name="event_severity_code_label")
	private String eventSeverityCodeLabel;

	@Column(name="event_severity_code_value")
	private String eventSeverityCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="event_severity_code_snomed")
	private Concept concept;

	public Long getEventSeverityCodeId() {
		return eventSeverityCodeId;
	}

	public void setEventSeverityCodeId(Long eventSeverityCodeId) {
		this.eventSeverityCodeId = eventSeverityCodeId;
	}

	public String getEventSeverityCodeLabel() {
		return eventSeverityCodeLabel;
	}

	public void setEventSeverityCodeLabel(String eventSeverityCodeLabel) {
		this.eventSeverityCodeLabel = eventSeverityCodeLabel;
	}

	public String getEventSeverityCodeValue() {
		return eventSeverityCodeValue;
	}

	public void setEventSeverityCodeValue(String eventSeverityCodeValue) {
		this.eventSeverityCodeValue = eventSeverityCodeValue;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
}
