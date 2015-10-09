package org.hemologica.salud.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8158360227900035958L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String code;

	//bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy="user")
	private List<UsersRoleService> usersRoleServices;

	public User() {
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

	public List<UsersRoleService> getUsersRoleServices() {
		return this.usersRoleServices;
	}

	public void setUsersRoleServices(List<UsersRoleService> usersRoleServices) {
		this.usersRoleServices = usersRoleServices;
	}

	public UsersRoleService addUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().add(usersRoleService);
		usersRoleService.setUser(this);

		return usersRoleService;
	}

	public UsersRoleService removeUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().remove(usersRoleService);
		usersRoleService.setUser(null);

		return usersRoleService;
	}

}