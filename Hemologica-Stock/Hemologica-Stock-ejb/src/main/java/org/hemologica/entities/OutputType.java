/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "output_types")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "OutputType.findAll", query = "SELECT o FROM OutputType o"),
	@NamedQuery(name = "OutputType.findByOutputTypeId", query = "SELECT o FROM OutputType o WHERE o.outputTypeId = :outputTypeId"),
	@NamedQuery(name = "OutputType.findByOutputTypeName", query = "SELECT o FROM OutputType o WHERE o.outputTypeName = :outputTypeName"),
	@NamedQuery(name = "OutputType.findByOutputTypeDescription", query = "SELECT o FROM OutputType o WHERE o.outputTypeDescription = :outputTypeDescription")})
public class OutputType implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "output_type_id")
	private Integer outputTypeId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "output_type_name")
	private String outputTypeName;
	@Size(max = 45)
    @Column(name = "output_type_description")
	private String outputTypeDescription;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "outputType")
	private List<Output> outputList;

	public OutputType() {
	}

	public OutputType(Integer outputTypeId) {
		this.outputTypeId = outputTypeId;
	}

	public OutputType(Integer outputTypeId, String outputTypeName) {
		this.outputTypeId = outputTypeId;
		this.outputTypeName = outputTypeName;
	}

	public Integer getOutputTypeId() {
		return outputTypeId;
	}

	public void setOutputTypeId(Integer outputTypeId) {
		this.outputTypeId = outputTypeId;
	}

	public String getOutputTypeName() {
		return outputTypeName;
	}

	public void setOutputTypeName(String outputTypeName) {
		this.outputTypeName = outputTypeName;
	}

	public String getOutputTypeDescription() {
		return outputTypeDescription;
	}

	public void setOutputTypeDescription(String outputTypeDescription) {
		this.outputTypeDescription = outputTypeDescription;
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
		hash += (outputTypeId != null ? outputTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OutputType)) {
			return false;
		}
		OutputType other = (OutputType) object;
		if ((this.outputTypeId == null && other.outputTypeId != null) || (this.outputTypeId != null && !this.outputTypeId.equals(other.outputTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.OutputType[ outputTypeId=" + outputTypeId + " ]";
	}
	
}
