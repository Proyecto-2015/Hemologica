package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the concepts database table.
 * 
 */
@Entity
@Table(name="concepts")
@NamedQuery(name="Concept.findAll", query="SELECT c FROM Concept c")
public class Concept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="concept_code")
	private String conceptCode;

	//bi-directional many-to-one association to BloodAboTypesCode
	@OneToMany(mappedBy="concept")
	private List<BloodAboTypesCode> bloodAboTypesCodes;

	//bi-directional many-to-one association to BloodDTypesCode
	@OneToMany(mappedBy="concept")
	private List<BloodDTypesCode> bloodDTypesCodes;

	//bi-directional many-to-one association to ConceptsDisplay
	@OneToMany(mappedBy="concept")
	private List<ConceptsDisplay> conceptsDisplays;

	//bi-directional many-to-one association to DonationDonorTypesCode
	@OneToMany(mappedBy="concept")
	private List<DonationDonorTypesCode> donationDonorTypesCodes;

	//bi-directional many-to-one association to DonationEventsCode
	@OneToMany(mappedBy="concept")
	private List<DonationEventsCode> donationEventsCodes;

	//bi-directional many-to-one association to DonationLaboratoyCode
	@OneToMany(mappedBy="concept")
	private List<DonationLaboratoyCode> donationLaboratoyCodes;

	//bi-directional many-to-one association to DonationTypesCode
	@OneToMany(mappedBy="concept")
	private List<DonationTypesCode> donationTypesCodes;

	//bi-directional many-to-one association to TransfusionEventsCode
	@OneToMany(mappedBy="concept")
	private List<TransfusionEventsCode> transfusionEventsCodes;

	//bi-directional many-to-one association to TransfusionLaboratoryCode
	@OneToMany(mappedBy="concept")
	private List<TransfusionLaboratoryCode> transfusionLaboratoryCodes;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConceptCode() {
		return this.conceptCode;
	}

	public void setConceptCode(String conceptCode) {
		this.conceptCode = conceptCode;
	}

	public List<BloodAboTypesCode> getBloodAboTypesCodes() {
		return this.bloodAboTypesCodes;
	}

	public void setBloodAboTypesCodes(List<BloodAboTypesCode> bloodAboTypesCodes) {
		this.bloodAboTypesCodes = bloodAboTypesCodes;
	}

	public BloodAboTypesCode addBloodAboTypesCode(BloodAboTypesCode bloodAboTypesCode) {
		getBloodAboTypesCodes().add(bloodAboTypesCode);
		bloodAboTypesCode.setConcept(this);

		return bloodAboTypesCode;
	}

	public BloodAboTypesCode removeBloodAboTypesCode(BloodAboTypesCode bloodAboTypesCode) {
		getBloodAboTypesCodes().remove(bloodAboTypesCode);
		bloodAboTypesCode.setConcept(null);

		return bloodAboTypesCode;
	}

	public List<BloodDTypesCode> getBloodDTypesCodes() {
		return this.bloodDTypesCodes;
	}

	public void setBloodDTypesCodes(List<BloodDTypesCode> bloodDTypesCodes) {
		this.bloodDTypesCodes = bloodDTypesCodes;
	}

	public BloodDTypesCode addBloodDTypesCode(BloodDTypesCode bloodDTypesCode) {
		getBloodDTypesCodes().add(bloodDTypesCode);
		bloodDTypesCode.setConcept(this);

		return bloodDTypesCode;
	}

	public BloodDTypesCode removeBloodDTypesCode(BloodDTypesCode bloodDTypesCode) {
		getBloodDTypesCodes().remove(bloodDTypesCode);
		bloodDTypesCode.setConcept(null);

		return bloodDTypesCode;
	}

	public List<ConceptsDisplay> getConceptsDisplays() {
		return this.conceptsDisplays;
	}

	public void setConceptsDisplays(List<ConceptsDisplay> conceptsDisplays) {
		this.conceptsDisplays = conceptsDisplays;
	}

	public ConceptsDisplay addConceptsDisplay(ConceptsDisplay conceptsDisplay) {
		getConceptsDisplays().add(conceptsDisplay);
		conceptsDisplay.setConcept(this);

		return conceptsDisplay;
	}

	public ConceptsDisplay removeConceptsDisplay(ConceptsDisplay conceptsDisplay) {
		getConceptsDisplays().remove(conceptsDisplay);
		conceptsDisplay.setConcept(null);

		return conceptsDisplay;
	}

	public List<DonationDonorTypesCode> getDonationDonorTypesCodes() {
		return this.donationDonorTypesCodes;
	}

	public void setDonationDonorTypesCodes(List<DonationDonorTypesCode> donationDonorTypesCodes) {
		this.donationDonorTypesCodes = donationDonorTypesCodes;
	}

	public DonationDonorTypesCode addDonationDonorTypesCode(DonationDonorTypesCode donationDonorTypesCode) {
		getDonationDonorTypesCodes().add(donationDonorTypesCode);
		donationDonorTypesCode.setConcept(this);

		return donationDonorTypesCode;
	}

	public DonationDonorTypesCode removeDonationDonorTypesCode(DonationDonorTypesCode donationDonorTypesCode) {
		getDonationDonorTypesCodes().remove(donationDonorTypesCode);
		donationDonorTypesCode.setConcept(null);

		return donationDonorTypesCode;
	}

	public List<DonationEventsCode> getDonationEventsCodes() {
		return this.donationEventsCodes;
	}

	public void setDonationEventsCodes(List<DonationEventsCode> donationEventsCodes) {
		this.donationEventsCodes = donationEventsCodes;
	}

	public DonationEventsCode addDonationEventsCode(DonationEventsCode donationEventsCode) {
		getDonationEventsCodes().add(donationEventsCode);
		donationEventsCode.setConcept(this);

		return donationEventsCode;
	}

	public DonationEventsCode removeDonationEventsCode(DonationEventsCode donationEventsCode) {
		getDonationEventsCodes().remove(donationEventsCode);
		donationEventsCode.setConcept(null);

		return donationEventsCode;
	}

	public List<DonationLaboratoyCode> getDonationLaboratoyCodes() {
		return this.donationLaboratoyCodes;
	}

	public void setDonationLaboratoyCodes(List<DonationLaboratoyCode> donationLaboratoyCodes) {
		this.donationLaboratoyCodes = donationLaboratoyCodes;
	}

	public DonationLaboratoyCode addDonationLaboratoyCode(DonationLaboratoyCode donationLaboratoyCode) {
		getDonationLaboratoyCodes().add(donationLaboratoyCode);
		donationLaboratoyCode.setConcept(this);

		return donationLaboratoyCode;
	}

	public DonationLaboratoyCode removeDonationLaboratoyCode(DonationLaboratoyCode donationLaboratoyCode) {
		getDonationLaboratoyCodes().remove(donationLaboratoyCode);
		donationLaboratoyCode.setConcept(null);

		return donationLaboratoyCode;
	}

	public List<DonationTypesCode> getDonationTypesCodes() {
		return this.donationTypesCodes;
	}

	public void setDonationTypesCodes(List<DonationTypesCode> donationTypesCodes) {
		this.donationTypesCodes = donationTypesCodes;
	}

	public DonationTypesCode addDonationTypesCode(DonationTypesCode donationTypesCode) {
		getDonationTypesCodes().add(donationTypesCode);
		donationTypesCode.setConcept(this);

		return donationTypesCode;
	}

	public DonationTypesCode removeDonationTypesCode(DonationTypesCode donationTypesCode) {
		getDonationTypesCodes().remove(donationTypesCode);
		donationTypesCode.setConcept(null);

		return donationTypesCode;
	}

	public List<TransfusionEventsCode> getTransfusionEventsCodes() {
		return this.transfusionEventsCodes;
	}

	public void setTransfusionEventsCodes(List<TransfusionEventsCode> transfusionEventsCodes) {
		this.transfusionEventsCodes = transfusionEventsCodes;
	}

	public TransfusionEventsCode addTransfusionEventsCode(TransfusionEventsCode transfusionEventsCode) {
		getTransfusionEventsCodes().add(transfusionEventsCode);
		transfusionEventsCode.setConcept(this);

		return transfusionEventsCode;
	}

	public TransfusionEventsCode removeTransfusionEventsCode(TransfusionEventsCode transfusionEventsCode) {
		getTransfusionEventsCodes().remove(transfusionEventsCode);
		transfusionEventsCode.setConcept(null);

		return transfusionEventsCode;
	}

	public List<TransfusionLaboratoryCode> getTransfusionLaboratoryCodes() {
		return this.transfusionLaboratoryCodes;
	}

	public void setTransfusionLaboratoryCodes(List<TransfusionLaboratoryCode> transfusionLaboratoryCodes) {
		this.transfusionLaboratoryCodes = transfusionLaboratoryCodes;
	}

	public TransfusionLaboratoryCode addTransfusionLaboratoryCode(TransfusionLaboratoryCode transfusionLaboratoryCode) {
		getTransfusionLaboratoryCodes().add(transfusionLaboratoryCode);
		transfusionLaboratoryCode.setConcept(this);

		return transfusionLaboratoryCode;
	}

	public TransfusionLaboratoryCode removeTransfusionLaboratoryCode(TransfusionLaboratoryCode transfusionLaboratoryCode) {
		getTransfusionLaboratoryCodes().remove(transfusionLaboratoryCode);
		transfusionLaboratoryCode.setConcept(null);

		return transfusionLaboratoryCode;
	}

}