package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.hemologica.salud.ejb.beans.DonationBeanLocal;
import org.hemologica.salud.ejb.datatypes.DonationResult;
import org.hemologica.salud.ejb.datatypes.DonationSearch;
import org.hemologica.salud.ejb.exceptions.BusinessException;

public class DonationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834951080949861155L;

	private SessionBB sessionBB;

	// search inputs
	private String searchPerson;
	private Date searchDateFrom;
	private Date searchDateTo;
	private String searchState;
	private String searchId;

	private Boolean renderResult;

	private List<DonationResult> resultDonations;

	@Inject
	private DonationBeanLocal donationBean;

	@PostConstruct
	public void init() {
		renderResult = false;
		this.searchDateTo = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		this.searchDateFrom = calendar.getTime();
	}

	public void search() {
		try {

			DonationSearch param = new DonationSearch();
			param.setPerson(searchPerson);
			param.setFrom(searchDateFrom);
			param.setTo(searchDateTo);
			resultDonations = donationBean.search(param);
			renderResult = true;
			
		} catch (BusinessException e) {
			e.printStackTrace();
		}

	}

	public void searchClear() {
		this.searchPerson = null;
		this.searchDateTo = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		this.searchDateFrom = calendar.getTime();
		renderResult = false;

	}

	public SessionBB getSessionBB() {
		return sessionBB;
	}

	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}

	public String getSearchPerson() {
		return searchPerson;
	}

	public void setSearchPerson(String searchPerson) {
		this.searchPerson = searchPerson;
	}

	public Date getSearchDateFrom() {
		return searchDateFrom;
	}

	public void setSearchDateFrom(Date searchDateFrom) {
		this.searchDateFrom = searchDateFrom;
	}

	public Date getSearchDateTo() {
		return searchDateTo;
	}

	public void setSearchDateTo(Date searchDateTo) {
		this.searchDateTo = searchDateTo;
	}

	public String getSearchState() {
		return searchState;
	}

	public void setSearchState(String searchState) {
		this.searchState = searchState;
	}

	public String getSearchId() {
		return searchId;
	}

	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	public Boolean getRenderResult() {
		return renderResult;
	}

	public void setRenderResult(Boolean renderResult) {
		this.renderResult = renderResult;
	}

	public List<DonationResult> getResultDonations() {
		return resultDonations;
	}

	public void setResultDonations(List<DonationResult> resultDonations) {
		this.resultDonations = resultDonations;
	}

}