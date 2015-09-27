package org.hemologica.salud.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5325052909041844780L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String code;

	private String description;

	//bi-directional many-to-one association to RolePermission
	@OneToMany(mappedBy="role")
	private List<RolePermission> rolePermissions;

	//bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy="role")
	private List<UsersRoleService> usersRoleServices;

	public Role() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<RolePermission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(List<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	public RolePermission addRolePermission(RolePermission rolePermission) {
		getRolePermissions().add(rolePermission);
		rolePermission.setRole(this);

		return rolePermission;
	}

	public RolePermission removeRolePermission(RolePermission rolePermission) {
		getRolePermissions().remove(rolePermission);
		rolePermission.setRole(null);

		return rolePermission;
	}

	public List<UsersRoleService> getUsersRoleServices() {
		return this.usersRoleServices;
	}

	public void setUsersRoleServices(List<UsersRoleService> usersRoleServices) {
		this.usersRoleServices = usersRoleServices;
	}

	public UsersRoleService addUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().add(usersRoleService);
		usersRoleService.setRole(this);

		return usersRoleService;
	}

	public UsersRoleService removeUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().remove(usersRoleService);
		usersRoleService.setRole(null);

		return usersRoleService;
	}

}