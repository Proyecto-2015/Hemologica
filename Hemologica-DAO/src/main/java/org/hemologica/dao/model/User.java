package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQueries(value={
		@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
		@NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
		@NamedQuery(name = "User.findByAccountToken", query = "SELECT u FROM User u WHERE u.activeAccountToken = :token"),
		@NamedQuery(name = "User.findByPersonId", query = "SELECT u FROM User u WHERE u.person = :personId"),
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "active_account")
	private Boolean activeAccount;
	
	@Column(name = "active_account_token")
	private String activeAccountToken;
	
	@Column(name = "active_account_token_time")
	private Date activeAccountTokenTime;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "password_reset")
	private Boolean passwordReset;
	
	@Column(name = "password_reset_token")
	private String passwordResetToken;
	
	@Column(name = "password_reset_token_time")
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}