package org.hemologica.salud.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the services database table.
 * 
 */
@Entity
@Table(name="services")
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3321283932831068298L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String code;

	//bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy="service")
	private List<UsersRoleService> usersRoleServices;

	public Service() {
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
		usersRoleService.setService(this);

		return usersRoleService;
	}

	public UsersRoleService removeUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().remove(usersRoleService);
		usersRoleService.setService(null);

		return usersRoleService;
	}

}