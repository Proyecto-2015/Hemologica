/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "outputs")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Output.findAll", query = "SELECT o FROM Output o"),
	@NamedQuery(name = "Output.findByOutputId", query = "SELECT o FROM Output o WHERE o.outputId = :outputId"),
	@NamedQuery(name = "Output.findByOutputDescription", query = "SELECT o FROM Output o WHERE o.outputDescription = :outputDescription"),
	@NamedQuery(name = "Output.findByOutputDate", query = "SELECT o FROM Output o WHERE o.outputDate = :outputDate"),
	@NamedQuery(name = "Output.findByOutputTimeReg", query = "SELECT o FROM Output o WHERE o.outputTimeReg = :outputTimeReg")})
public class Output implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "output_id")
	private Long outputId;
	@Size(max = 45)
	@Basic(optional = false)
    @Column(name = "output_service_id")
	private String outputServiceId;
	@Size(max = 45)
    @Column(name = "output_description")
	private String outputDescription;
	@Basic(optional = false)
    @NotNull
    @Column(name = "output_date")
    @Temporal(TemporalType.DATE)
	private Date outputDate;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "output_time_reg")
	private String outputTimeReg;
	@JoinColumn(name = "output_type", referencedColumnName = "output_type_id")
    @ManyToOne(optional = false)
	private OutputType outputType;
	@JoinColumn(name = "output_input", referencedColumnName = "input_id")
    @ManyToOne(optional = false)
	private Input outputInput;

	public Output() {
	}

	public Output(Long outputId) {
		this.outputId = outputId;
	}

	public Output(Long outputId, Date outputDate, String outputTimeReg) {
		this.outputId = outputId;
		this.outputDate = outputDate;
		this.outputTimeReg = outputTimeReg;
	}

	public Long getOutputId() {
		return outputId;
	}

	public void setOutputId(Long outputId) {
		this.outputId = outputId;
	}

	public String getOutputDescription() {
		return outputDescription;
	}

	public void setOutputDescription(String outputDescription) {
		this.outputDescription = outputDescription;
	}

	public Date getOutputDate() {
		return outputDate;
	}

	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}

	public String getOutputTimeReg() {
		return outputTimeReg;
	}

	public void setOutputTimeReg(String outputTimeReg) {
		this.outputTimeReg = outputTimeReg;
	}

	public OutputType getOutputType() {
		return outputType;
	}

	public void setOutputType(OutputType outputType) {
		this.outputType = outputType;
	}

	public Input getOutputInput() {
		return outputInput;
	}

	public void setOutputInput(Input outputInput) {
		this.outputInput = outputInput;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (outputId != null ? outputId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Output)) {
			return false;
		}
		Output other = (Output) object;
		if ((this.outputId == null && other.outputId != null) || (this.outputId != null && !this.outputId.equals(other.outputId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Output[ outputId=" + outputId + " ]";
	}

	/**
	 * @return the outputServiceId
	 */
	public String getOutputServiceId() {
		return outputServiceId;
	}

	/**
	 * @param outputServiceId the outputServiceId to set
	 */
	public void setOutputServiceId(String outputServiceId) {
		this.outputServiceId = outputServiceId;
	}
	
}
