package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.hemologica.datatypes.DonationResult;


public class SearchDonationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834951080949861155L;

	private static final Logger logger = Logger.getLogger(SearchDonationBB.class.getName());
	
	private SessionBB sessionBB;

	// search inputs
	private String searchPerson;
	private Date searchDateFrom;
	private Date searchDateTo;
	private String searchState;
	private String searchId;

	private Boolean renderResult;

	private List<DonationResult> resultDonations;


	@PostConstruct
	public void init() {
		renderResult = false;
		this.searchDateTo = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		this.searchDateFrom = calendar.getTime();
	}

	public void search() {
		logger.info("DonationBB > do search");
		this.renderResult = true;
		this.resultDonations = new ArrayList<DonationResult>();
		for(int i=0; i < 10; ++i){
			this.resultDonations.add(new DonationResult(""+ i, "1234567-"+i, "Nombre Apellido", new Date(), "Montevideo"));
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