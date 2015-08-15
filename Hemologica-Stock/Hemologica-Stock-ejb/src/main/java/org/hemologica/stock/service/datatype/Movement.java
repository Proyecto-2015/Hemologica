/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hemologica.stock.service.datatype;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruno
 */
@XmlRootElement(name = "movement")
public class Movement implements Serializable {

	@XmlElement(name = "id", required = true)
	private String movementId;

	@XmlElement(name = "movementType", required = true)
	private String movementType;

	@XmlElement(name = "date", required = true)
	private Date movementDate;

	@XmlElement(name = "cause", required = true)
	private String movementCause;

	@XmlElement(name = "description", required = false)
	private String movementDescription;

	@XmlElement(name = "donation", required = true)
	private String unitServiceDonationCode;

	@XmlElement(name = "unitType", required = true)
	private String unitType;

	@XmlElement(name = "unitCode", required = true)
	private String unitServiceCode;

	@XmlElement(name = "unitVolume", required = true)
	private String unitVolume;

	/**
	 * @return the movementId
	 */
	public String getMovementId() {
		return movementId;
	}

	/**
	 * @param movementId the movementId to set
	 */
	public void setMovementId(String movementId) {
		this.movementId = movementId;
	}

	/**
	 * @return the movementType
	 */
	public String getMovementType() {
		return movementType;
	}

	/**
	 * @param movementType the movementType to set
	 */
	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	/**
	 * @return the movementDate
	 */
	public Date getMovementDate() {
		return movementDate;
	}

	/**
	 * @param movementDate the movementDate to set
	 */
	public void setMovementDate(Date movementDate) {
		this.movementDate = movementDate;
	}

	/**
	 * @return the movementCause
	 */
	public String getMovementCause() {
		return movementCause;
	}

	/**
	 * @param movementCause the movementCause to set
	 */
	public void setMovementCause(String movementCause) {
		this.movementCause = movementCause;
	}

	/**
	 * @return the movementDescription
	 */
	public String getMovementDescription() {
		return movementDescription;
	}

	/**
	 * @param movementDescription the movementDescription to set
	 */
	public void setMovementDescription(String movementDescription) {
		this.movementDescription = movementDescription;
	}

	/**
	 * @return the unitServiceDonationCode
	 */
	public String getUnitServiceDonationCode() {
		return unitServiceDonationCode;
	}

	/**
	 * @param unitServiceDonationCode the unitServiceDonationCode to set
	 */
	public void setUnitServiceDonationCode(String unitServiceDonationCode) {
		this.unitServiceDonationCode = unitServiceDonationCode;
	}

	/**
	 * @return the unitType
	 */
	public String getUnitType() {
		return unitType;
	}

	/**
	 * @param unitType the unitType to set
	 */
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	/**
	 * @return the unitServiceCode
	 */
	public String getUnitServiceCode() {
		return unitServiceCode;
	}

	/**
	 * @param unitServiceCode the unitServiceCode to set
	 */
	public void setUnitServiceCode(String unitServiceCode) {
		this.unitServiceCode = unitServiceCode;
	}

	/**
	 * @return the unitVolume
	 */
	public String getUnitVolume() {
		return unitVolume;
	}

	/**
	 * @param unitVolume the unitVolume to set
	 */
	public void setUnitVolume(String unitVolume) {
		this.unitVolume = unitVolume;
	}

}
