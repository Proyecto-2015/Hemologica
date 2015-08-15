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
@Table(name = "perms")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Perm.findAll", query = "SELECT p FROM Perm p"),
	@NamedQuery(name = "Perm.findByPermId", query = "SELECT p FROM Perm p WHERE p.permId = :permId"),
	@NamedQuery(name = "Perm.findByPermCode", query = "SELECT p FROM Perm p WHERE p.permCode = :permCode")})
public class Perm implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "perm_id")
	private Integer permId;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "perm_code")
	private String permCode;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perm")
	private List<RolePerm> rolePermList;

	public Perm() {
	}

	public Perm(Integer permId) {
		this.permId = permId;
	}

	public Perm(Integer permId, String permCode) {
		this.permId = permId;
		this.permCode = permCode;
	}

	public Integer getPermId() {
		return permId;
	}

	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	public String getPermCode() {
		return permCode;
	}

	public void setPermCode(String permCode) {
		this.permCode = permCode;
	}

	@XmlTransient
	public List<RolePerm> getRolePermList() {
		return rolePermList;
	}

	public void setRolePermList(List<RolePerm> rolePermList) {
		this.rolePermList = rolePermList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (permId != null ? permId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Perm)) {
			return false;
		}
		Perm other = (Perm) object;
		if ((this.permId == null && other.permId != null) || (this.permId != null && !this.permId.equals(other.permId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.hemologica.entities.Perm[ permId=" + permId + " ]";
	}
	
}
