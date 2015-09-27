package org.hemologica.salud.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users_role_services database table.
 * 
 */
@Entity
@Table(name="users_role_services")
@NamedQuery(name="UsersRoleService.findAll", query="SELECT u FROM UsersRoleService u")
public class UsersRoleService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2882998630254439074L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	//bi-directional many-to-one association to Service
	@ManyToOne
	@JoinColumn(name="services_id")
	private Service service;

	public UsersRoleService() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}