/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "inputs")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Input.findAll", query = "SELECT i FROM Input i"),
	@NamedQuery(name = "Input.findByInputId", query = "SELECT i FROM Input i WHERE i.inputId = :inputId"),
	@NamedQuery(name = "Input.findByInputDescription", query = "SELECT i FROM Input i WHERE i.inputDescription = :inputDescription"),
	@NamedQuery(name = "Input.findByInputDate", query = "SELECT i FROM Input i WHERE i.inputDate = :inputDate"),
	@NamedQuery(name = "Input.findByInputTimeReg", query = "SELECT i FROM Input i WHERE i.inputTimeReg = :inputTimeReg")})
public class Input implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "input_id")
	private Integer inputId;
	@Size(max = 45)
	@Basic(optional = false)
    @Column(name = "input_service_id")
	private String inputServiceId;
	@Size(max = 45)
    @Column(name = "input_description")
	private String inputDescription;
	@Basic(optional = false)
    @NotNull
    @Column(name = "input_date")
    @Temporal(TemporalType.DATE)
	private Date inputDate;
	@Basic(optional = false)
    @NotNull
    @Column(name = "input_time_reg")
    @Temporal(TemporalType.TIMESTAMP)
	private Date inputTimeReg;
	@JoinColumn(name = "input_unit", referencedColumnName = "unit_id")
    @ManyToOne(optional = false)
	private Unit inputUnit;
	@JoinColumn(name = "input_service", referencedColumnName = "service_id")
    @ManyToOne(optional = false)
	private Service inputService;
	@JoinColumn(name = "input_type", referencedColumnName = "input_type_id")
    @ManyToOne(optional = false)
	private InputType inputType;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "outputInput")
	private List<Output> outputList;

	public Input() {
	}

	public Input(Integer inputId) {
		this.inputId = inputId;
	}

	public Input(Integer inputId, Date inputDate, Date inputTimeReg) {
		this.inputId = inputId;
		this.inputDate = inputDate;
		this.inputTimeReg = inputTimeReg;
	}

	public Integer getInputId() {
		return inputId;
	}

	public void setInputId(Integer inputId) {
		this.inputId = inputId;
	}

	public String getInputDescription() {
		return inputDescription;
	}

	public void setInputDescription(String inputDescription) {
		this.inputDescription = inputDescription;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public Date getInputTimeReg() {
		return inputTimeReg;
	}

	public void setInputTimeReg(Date inputTimeReg) {
		this.inputTimeReg = inputTimeReg;
	}

	public Unit getInputUnit() {
		return inputUnit;
	}

	public void setInputUnit(Unit inputUnit) {
		this.inputUnit = inputUnit;
	}

	public Service getInputService() {
		return inputService;
	}

	public void setInputService(Service inputService) {
		this.inputService = inputService;
	}

	public InputType getInputType() {
		return inputType;
	}

	public void setInputType(InputType inputType) {
		this.inputType = inputType;
	}

	@XmlTransient
	public List<Output> getOutputList() {
		return outputList;
	}

	public void setOutputList(List<Output> outputList) {
		this.outputList = outputList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (inputId != null ? inputId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Input)) {
			return false;
		}
		Input other = (Input) object;
		if ((this.inputId == null && other.inputId != null) || (this.inputId != null && !this.inputId.equals(other.inputId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Input[ inputId=" + inputId + " ]";
	}

	/**
	 * @return the inputServiceId
	 */
	public String getInputServiceId() {
		return inputServiceId;
	}

	/**
	 * @param inputServiceId the inputServiceId to set
	 */
	public void setInputServiceId(String inputServiceId) {
		this.inputServiceId = inputServiceId;
	}
	
}
