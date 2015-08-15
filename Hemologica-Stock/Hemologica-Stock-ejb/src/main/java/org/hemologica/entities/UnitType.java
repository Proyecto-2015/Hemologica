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
@Table(name = "unit_types")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "UnitType.findAll", query = "SELECT u FROM UnitType u"),
	@NamedQuery(name = "UnitType.findByUnitTypeId", query = "SELECT u FROM UnitType u WHERE u.unitTypeId = :unitTypeId"),
	@NamedQuery(name = "UnitType.findByUnitTypeName", query = "SELECT u FROM UnitType u WHERE u.unitTypeName = :unitTypeName"),
	@NamedQuery(name = "UnitType.findByUnitTypeDescription", query = "SELECT u FROM UnitType u WHERE u.unitTypeDescription = :unitTypeDescription"),
	@NamedQuery(name = "UnitType.findByUnitTypeCode", query = "SELECT u FROM UnitType u WHERE u.unitTypeCode = :unitTypeCode")})
public class UnitType implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "unit_type_id")
	private Integer unitTypeId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unit_type_name")
	private String unitTypeName;
	@Size(max = 45)
    @Column(name = "unit_type_description")
	private String unitTypeDescription;
	@Size(max = 45)
    @Column(name = "unit_type_code")
	private String unitTypeCode;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "unitTypeId")
	private List<Unit> unitList;

	public UnitType() {
	}

	public UnitType(Integer unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public UnitType(Integer unitTypeId, String unitTypeName) {
		this.unitTypeId = unitTypeId;
		this.unitTypeName = unitTypeName;
	}

	public Integer getUnitTypeId() {
		return unitTypeId;
	}

	public void setUnitTypeId(Integer unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getUnitTypeName() {
		return unitTypeName;
	}

	public void setUnitTypeName(String unitTypeName) {
		this.unitTypeName = unitTypeName;
	}

	public String getUnitTypeDescription() {
		return unitTypeDescription;
	}

	public void setUnitTypeDescription(String unitTypeDescription) {
		this.unitTypeDescription = unitTypeDescription;
	}

	public String getUnitTypeCode() {
		return unitTypeCode;
	}

	public void setUnitTypeCode(String unitTypeCode) {
		this.unitTypeCode = unitTypeCode;
	}

	@XmlTransient
	public List<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<Unit> unitList) {
		this.unitList = unitList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (unitTypeId != null ? unitTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof UnitType)) {
			return false;
		}
		UnitType other = (UnitType) object;
		if ((this.unitTypeId == null && other.unitTypeId != null) || (this.unitTypeId != null && !this.unitTypeId.equals(other.unitTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.UnitType[ unitTypeId=" + unitTypeId + " ]";
	}
	
}
