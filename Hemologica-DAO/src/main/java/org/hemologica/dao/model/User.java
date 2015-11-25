package org.hemologica.dao.model;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String code;

	//bi-directional many-to-one association to Person
//	@OneToMany(mappedBy="user")
//	private List<Person> persons;
	
	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="persons_id")
	private Person person;
	

	//bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy="user")
	private List<UsersRoleService> usersRoleServices;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

//	public Person addPerson(Person person) {
//		getPersons().add(person);
//		person.setUser(this);
//
//		return person;
//	}
//
//	public Person removePerson(Person person) {
//		getPersons().remove(person);
//		person.setUser(null);
//
//		return person;
//	}

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