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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "units")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Unit.findAll", query = "SELECT u FROM Unit u"),
	@NamedQuery(name = "Unit.findByUnitId", query = "SELECT u FROM Unit u WHERE u.unitId = :unitId"),
	@NamedQuery(name = "Unit.findByUnitServiceCode", query = "SELECT u FROM Unit u WHERE u.unitServiceCode = :unitServiceCode"),
	@NamedQuery(name = "Unit.findByUnitServiceDonationCode", query = "SELECT u FROM Unit u WHERE u.unitServiceDonationCode = :unitServiceDonationCode")})
public class Unit implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "unit_id")
	private Long unitId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unit_service_code")
	private String unitServiceCode;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unit_service_donation_code")
	private String unitServiceDonationCode;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "inputUnit")
	private List<Input> inputList;
	@JoinColumn(name = "unit_type", referencedColumnName = "unit_type_id")
    @ManyToOne(optional = false)
	private UnitType unitType;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unit_volume")
	private String unitVolume;

	public Unit() {
	}

	public Unit(Long unitId) {
		this.unitId = unitId;
	}

	public Unit(Long unitId, String unitServiceCode, String unitServiceDonationCode) {
		this.unitId = unitId;
		this.unitServiceCode = unitServiceCode;
		this.unitServiceDonationCode = unitServiceDonationCode;
	}

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public String getUnitServiceCode() {
		return unitServiceCode;
	}

	public void setUnitServiceCode(String unitServiceCode) {
		this.unitServiceCode = unitServiceCode;
	}

	public String getUnitServiceDonationCode() {
		return unitServiceDonationCode;
	}

	public void setUnitServiceDonationCode(String unitServiceDonationCode) {
		this.unitServiceDonationCode = unitServiceDonationCode;
	}

	@XmlTransient
	public List<Input> getInputList() {
		return inputList;
	}

	public void setInputList(List<Input> inputList) {
		this.inputList = inputList;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (unitId != null ? unitId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Unit)) {
			return false;
		}
		Unit other = (Unit) object;
		if ((this.unitId == null && other.unitId != null) || (this.unitId != null && !this.unitId.equals(other.unitId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Unit[ unitId=" + unitId + " ]";
	}

	/**
	 * @return the unitVolume
	 */
	public String getUnitVolume() {
		return unitVolume;
	}

	/**
	 * @param unitVolume the unitVolume to set
	 */
	public void setUnitVolume(String unitVolume) {
		this.unitVolume = unitVolume;
	}
	
}
