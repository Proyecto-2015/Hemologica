package org.hemologica.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="sequencer")
@NamedQueries(value={
	@NamedQuery(name="Sequencer.findAll", query="SELECT r FROM Sequencer r"),
	@NamedQuery(name="Sequencer.findById", query="SELECT r FROM Sequencer r WHERE r.sequencerCodeValue = :code")
})
public class Sequencer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sequencer_code_id")
	private int sequencerCodeId;

	@Column(name="sequencer_code_value")
	private String sequencerCodeValue;
	
	@Column(name="sequencer_code_name")
	private String sequencerCodeName;
	
	@Column(name="sequencer_number")
	private Long sequencerNumber;

	public int getSequencerCodeId() {
		return sequencerCodeId;
	}

	public void setSequencerCodeId(int sequencerCodeId) {
		this.sequencerCodeId = sequencerCodeId;
	}

	public String getSequencerCodeValue() {
		return sequencerCodeValue;
	}

	public void setSequencerCodeValue(String sequencerCodeValue) {
		this.sequencerCodeValue = sequencerCodeValue;
	}

	public String getSequencerCodeName() {
		return sequencerCodeName;
	}

	public void setSequencerCodeName(String sequencerCodeName) {
		this.sequencerCodeName = sequencerCodeName;
	}

	public Long getSequencerNumber() {
		return sequencerNumber;
	}

	public void setSequencerNumber(Long sequencerNumber) {
		this.sequencerNumber = sequencerNumber;
	}

}
