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
@Table(name = "role_perm")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "RolePerm.findAll", query = "SELECT r FROM RolePerm r"),
	@NamedQuery(name = "RolePerm.findByRolePermId", query = "SELECT r FROM RolePerm r WHERE r.rolePermId = :rolePermId")})
public class RolePerm implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_perm_id")
	private Integer rolePermId;
	@JoinColumn(name = "role", referencedColumnName = "role_id")
    @ManyToOne(optional = false)
	private Role role;
	@JoinColumn(name = "perm", referencedColumnName = "perm_id")
    @ManyToOne(optional = false)
	private Perm perm;

	public RolePerm() {
	}

	public RolePerm(Integer rolePermId) {
		this.rolePermId = rolePermId;
	}

	public Integer getRolePermId() {
		return rolePermId;
	}

	public void setRolePermId(Integer rolePermId) {
		this.rolePermId = rolePermId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Perm getPerm() {
		return perm;
	}

	public void setPerm(Perm perm) {
		this.perm = perm;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rolePermId != null ? rolePermId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof RolePerm)) {
			return false;
		}
		RolePerm other = (RolePerm) object;
		if ((this.rolePermId == null && other.rolePermId != null) || (this.rolePermId != null && !this.rolePermId.equals(other.rolePermId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.RolePerm[ rolePermId=" + rolePermId + " ]";
	}
	
}
