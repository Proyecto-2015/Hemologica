package org.hemologica.salud.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role_permissions database table.
 * 
 */
@Entity
@Table(name="role_permissions")
@NamedQuery(name="RolePermission.findAll", query="SELECT r FROM RolePermission r")
public class RolePermission implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7435034965411478073L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name="permissions_id")
	private Permission permission;

	public RolePermission() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}