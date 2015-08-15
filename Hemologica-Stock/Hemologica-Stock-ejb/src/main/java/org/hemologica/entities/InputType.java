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
@Table(name = "input_types")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "InputType.findAll", query = "SELECT i FROM InputType i"),
	@NamedQuery(name = "InputType.findByInputTypeId", query = "SELECT i FROM InputType i WHERE i.inputTypeId = :inputTypeId"),
	@NamedQuery(name = "InputType.findByInputTypeName", query = "SELECT i FROM InputType i WHERE i.inputTypeName = :inputTypeName"),
	@NamedQuery(name = "InputType.findByInputTypeDescription", query = "SELECT i FROM InputType i WHERE i.inputTypeDescription = :inputTypeDescription")})
public class InputType implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "input_type_id")
	private Integer inputTypeId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "input_type_name")
	private String inputTypeName;
	@Size(max = 45)
    @Column(name = "input_type_description")
	private String inputTypeDescription;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "inputTypeInputTypeId")
	private List<Input> inputList;

	public InputType() {
	}

	public InputType(Integer inputTypeId) {
		this.inputTypeId = inputTypeId;
	}

	public InputType(Integer inputTypeId, String inputTypeName) {
		this.inputTypeId = inputTypeId;
		this.inputTypeName = inputTypeName;
	}

	public Integer getInputTypeId() {
		return inputTypeId;
	}

	public void setInputTypeId(Integer inputTypeId) {
		this.inputTypeId = inputTypeId;
	}

	public String getInputTypeName() {
		return inputTypeName;
	}

	public void setInputTypeName(String inputTypeName) {
		this.inputTypeName = inputTypeName;
	}

	public String getInputTypeDescription() {
		return inputTypeDescription;
	}

	public void setInputTypeDescription(String inputTypeDescription) {
		this.inputTypeDescription = inputTypeDescription;
	}

	@XmlTransient
	public List<Input> getInputList() {
		return inputList;
	}

	public void setInputList(List<Input> inputList) {
		this.inputList = inputList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (inputTypeId != null ? inputTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof InputType)) {
			return false;
		}
		InputType other = (InputType) object;
		if ((this.inputTypeId == null && other.inputTypeId != null) || (this.inputTypeId != null && !this.inputTypeId.equals(other.inputTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.InputType[ inputTypeId=" + inputTypeId + " ]";
	}
	
}
