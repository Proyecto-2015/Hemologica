package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="search_filter_codes")
@NamedQueries({
@NamedQuery(name="SearchFilterCode.findAll", query="SELECT d FROM SearchFilterCode d"),
@NamedQuery(name="SearchFilterCode.findByCode", query="SELECT d FROM SearchFilterCode d WHERE d.searchFilterCodesValue = :code"),

})
public class SearchFilterCode implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="search_filter_codes_id")
	private Long searchFilterCodes;

	@Column(name="search_filter_codes_label")
	private String searchFilterCodesLabel;

	@Column(name="search_filter_codes_value")
	private String searchFilterCodesValue;
	
	@Column(name="search_filter_codes_path")
	private String searchFilterCodesPath;

	public Long getSearchFilterCodes() {
		return searchFilterCodes;
	}

	public void setSearchFilterCodes(Long searchFilterCodes) {
		this.searchFilterCodes = searchFilterCodes;
	}

	public String getSearchFilterCodesLabel() {
		return searchFilterCodesLabel;
	}

	public void setSearchFilterCodesLabel(String searchFilterCodesLabel) {
		this.searchFilterCodesLabel = searchFilterCodesLabel;
	}

	public String getSearchFilterCodesValue() {
		return searchFilterCodesValue;
	}

	public void setSearchFilterCodesValue(String searchFilterCodesValue) {
		this.searchFilterCodesValue = searchFilterCodesValue;
	}

	public String getSearchFilterCodesPath() {
		return searchFilterCodesPath;
	}

	public void setSearchFilterCodesPath(String searchFilterCodesPath) {
		this.searchFilterCodesPath = searchFilterCodesPath;
	}
	
	
}
