package org.hemologica.dao.model;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(columnDefinition = "code")
	private String code;
	
	@Column(columnDefinition = "active_account")
	private Boolean activeAccount;
	
	@Column(columnDefinition = "active_account_token")
	private String activeAccountToken;
	
	@Column(columnDefinition = "active_account_token_time")
	private Date activeAccountTokenTime;
	
	@Column(columnDefinition = "password_account")
	private Boolean passwordReset;
	
	@Column(columnDefinition = "password_account_token")
	private String passwordResetToken;
	
	@Column(columnDefinition = "password_account_token_time")
	private Date passwordResetTokenTime;

	public Boolean getActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(Boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public String getActiveAccountToken() {
		return activeAccountToken;
	}

	public void setActiveAccountToken(String activeAccountToken) {
		this.activeAccountToken = activeAccountToken;
	}

	public Date getActiveAccountTokenTime() {
		return activeAccountTokenTime;
	}

	public void setActiveAccountTokenTime(Date activeAccountTokenTime) {
		this.activeAccountTokenTime = activeAccountTokenTime;
	}

	public Boolean getPasswordReset() {
		return passwordReset;
	}

	public void setPasswordReset(Boolean passwordReset) {
		this.passwordReset = passwordReset;
	}

	public String getPasswordResetToken() {
		return passwordResetToken;
	}

	public void setPasswordResetToken(String passwordResetToken) {
		this.passwordResetToken = passwordResetToken;
	}

	public Date getPasswordResetTokenTime() {
		return passwordResetTokenTime;
	}

	public void setPasswordResetTokenTime(Date passwordResetTokenTime) {
		this.passwordResetTokenTime = passwordResetTokenTime;
	}

	// bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name = "persons_id")
	private Person person;

	// bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy = "user")
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