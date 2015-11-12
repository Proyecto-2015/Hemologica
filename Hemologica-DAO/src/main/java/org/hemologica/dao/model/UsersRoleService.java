package org.hemologica.dao.model;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	//bi-directional many-to-one association to Service
	@ManyToOne
	@JoinColumn(name="services_id")
	private Service service;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;

	public UsersRoleService() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}