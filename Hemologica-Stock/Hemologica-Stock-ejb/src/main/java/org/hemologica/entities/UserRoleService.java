/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruno
 */
@Entity
@Table(name = "user_role_service")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "UserRoleService.findAll", query = "SELECT u FROM UserRoleService u"),
	@NamedQuery(name = "UserRoleService.findByUserRoleServiceId", query = "SELECT u FROM UserRoleService u WHERE u.userRoleServiceId = :userRoleServiceId")})
public class UserRoleService implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_role_service_id")
	private Integer userRoleServiceId;
	@JoinColumn(name = "user", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
	private User user;
	@JoinColumn(name = "service", referencedColumnName = "service_id")
    @ManyToOne(optional = false)
	private Service service;
	@JoinColumn(name = "role", referencedColumnName = "role_id")
    @ManyToOne(optional = false)
	private Role role;

	public UserRoleService() {
	}

	public UserRoleService(Integer userRoleServiceId) {
		this.userRoleServiceId = userRoleServiceId;
	}

	public Integer getUserRoleServiceId() {
		return userRoleServiceId;
	}

	public void setUserRoleServiceId(Integer userRoleServiceId) {
		this.userRoleServiceId = userRoleServiceId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userRoleServiceId != null ? userRoleServiceId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof UserRoleService)) {
			return false;
		}
		UserRoleService other = (UserRoleService) object;
		if ((this.userRoleServiceId == null && other.userRoleServiceId != null) || (this.userRoleServiceId != null && !this.userRoleServiceId.equals(other.userRoleServiceId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.UserRoleService[ userRoleServiceId=" + userRoleServiceId + " ]";
	}
	
}
