package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hemologica.dao.enums.CenterType;

import java.util.List;


/**
 * The persistent class for the centers database table.
 * 
 */
@Entity
@Table(name="centers")
@NamedQueries({
@NamedQuery(name="Center.findAll", query="SELECT c FROM Center c"),
@NamedQuery(name="Center.findAllBanks", query="SELECT c FROM Center c WHERE c.centerType = 'bank' "),
@NamedQuery(name="Center.findBankById", query="SELECT c FROM Center c WHERE c.centerType = 'bank' AND c.centerCode = :code"),
@NamedQuery(name="Center.findAllTransfusionCenters", query="SELECT c FROM Center c WHERE c.centerType = 'transfusionCenter' "),
@NamedQuery(name="Center.findBankByInstitutionId", query="SELECT c FROM Center c WHERE c.centerType = 'bank'AND c.institution.institutionCode = :code")
})
public class Center implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="center_code")
	private String centerCode;

	@Column(name="center_display_name")
	private String centerDisplayName;

	@Column(name="center_oid")
	private String centerOid;

	@Column(name="center_type")
	private CenterType centerType;
	
	@Column(name="center_address")
	private String centerAddress;
	
	@Column(name="center_email")
	private String centerEmail;
	
	@Column(name="center_hour")
	private String centerHour;
	
	@Column(name="center_telephone")
	private String centerTelephone;
	
	@Column(name="center_information")
	private String centerInformation;
	
	//bi-directional many-to-one association to GeoLocation
	@ManyToOne
	@JoinColumn(name="center_location")
	private GeoLocation geoLocation;

	//bi-directional many-to-one association to Institution
	@ManyToOne
	@JoinColumn(name="center_institution_id")
	private Institution institution;

	//bi-directional many-to-one association to Unit
//	@OneToMany(mappedBy="center")
//	private List<Unit> units;
	
	//bi-directional many-to-one association to Movement
	@OneToMany(mappedBy="center")
	private List<Movement> movements;

	//bi-directional many-to-one association to UsersRoleService
	@OneToMany(mappedBy="center")
	private List<UsersRoleService> usersRoleServices;


	public Center() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCenterDisplayName() {
		return this.centerDisplayName;
	}

	public void setCenterDisplayName(String centerDisplayName) {
		this.centerDisplayName = centerDisplayName;
	}

	public String getCenterOid() {
		return this.centerOid;
	}

	public void setCenterOid(String centerOid) {
		this.centerOid = centerOid;
	}

	public GeoLocation getGeoLocation() {
		return this.geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Institution getInstitution() {
		return this.institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}
	
	public CenterType getCenterType() {
		return centerType;
	}

	public void setCenterType(CenterType centerType) {
		this.centerType = centerType;
	}

//	public List<Unit> getUnits() {
//		return this.units;
//	}
//
//	public void setUnits(List<Unit> units) {
//		this.units = units;
//	}
	
	public String getCenterAddress() {
		return centerAddress;
	}

	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	public String getCenterEmail() {
		return centerEmail;
	}

	public void setCenterEmail(String centerEmail) {
		this.centerEmail = centerEmail;
	}

	public String getCenterHour() {
		return centerHour;
	}

	public void setCenterHour(String centerHour) {
		this.centerHour = centerHour;
	}

	public String getCenterTelephone() {
		return centerTelephone;
	}

	public void setCenterTelephone(String centerTelephone) {
		this.centerTelephone = centerTelephone;
	}

	public String getCenterInformation() {
		return centerInformation;
	}

	public void setCenterInformation(String centerInformation) {
		this.centerInformation = centerInformation;
	}
	
//	public Unit addUnit(Unit unit) {
//		getUnits().add(unit);
//		unit.setCenter(this);
//
//		return unit;
//	}
//
//	public Unit removeUnit(Unit unit) {
//		getUnits().remove(unit);
//		unit.setCenter(null);
//
//		return unit;
//	}
	
	public List<Movement> getMovements() {
		return this.movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public Movement addMovement(Movement movement) {
		getMovements().add(movement);
		movement.setCenter(this);

		return movement;
	}

	public Movement removeMovement(Movement movement) {
		getMovements().remove(movement);
		movement.setCenter(null);

		return movement;
	}

	public List<UsersRoleService> getUsersRoleServices() {
		return this.usersRoleServices;
	}

	public void setUsersRoleServices(List<UsersRoleService> usersRoleServices) {
		this.usersRoleServices = usersRoleServices;
	}

	public UsersRoleService addUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().add(usersRoleService);
		usersRoleService.setCenter(this);

		return usersRoleService;
	}

	public UsersRoleService removeUsersRoleService(UsersRoleService usersRoleService) {
		getUsersRoleServices().remove(usersRoleService);
		usersRoleService.setCenter(null);

		return usersRoleService;
	}

}