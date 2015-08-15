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
@Table(name = "services")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s"),
	@NamedQuery(name = "Service.findByServiceId", query = "SELECT s FROM Service s WHERE s.serviceId = :serviceId"),
	@NamedQuery(name = "Service.findByServiceOid", query = "SELECT s FROM Service s WHERE s.serviceOid = :serviceOid")})
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "service_id")
	private Integer serviceId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "service_oid")
	private String serviceOid;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "servicesServiceId")
	private List<UserRoleService> userRoleServiceList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "servicesServiceId")
	private List<Input> inputList;

	public Service() {
	}

	public Service(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Service(Integer serviceId, String serviceOid) {
		this.serviceId = serviceId;
		this.serviceOid = serviceOid;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceOid() {
		return serviceOid;
	}

	public void setServiceOid(String serviceOid) {
		this.serviceOid = serviceOid;
	}

	@XmlTransient
	public List<UserRoleService> getUserRoleServiceList() {
		return userRoleServiceList;
	}

	public void setUserRoleServiceList(List<UserRoleService> userRoleServiceList) {
		this.userRoleServiceList = userRoleServiceList;
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
		hash += (serviceId != null ? serviceId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Service)) {
			return false;
		}
		Service other = (Service) object;
		if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Service[ serviceId=" + serviceId + " ]";
	}
	
}
