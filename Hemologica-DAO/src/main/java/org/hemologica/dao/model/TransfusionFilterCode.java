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
@Table(name="transfusion_filter_codes")
@NamedQueries({
@NamedQuery(name="TransfusionFilterCode.findAll", query="SELECT d FROM TransfusionFilterCode d"),
@NamedQuery(name="TransfusionFilterCode.findById", query="SELECT d FROM TransfusionFilterCode d WHERE d.transfusionFilterCodesValue = :code")
})
public class TransfusionFilterCode implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transfusion_filter_codes_id")
	private Long transfusionFilterCodes;

	@Column(name="transfusion_filter_codes_label")
	private String transfusionFilterCodesLabel;

	@Column(name="transfusion_filter_codes_value")
	private String transfusionFilterCodesValue;
	
	@Column(name="transfusion_filter_codes_path")
	private String transfusionFilterCodesPath;
	
	@Column(name="transfusion_filter_codes_sql")
	private String transfusionFilterCodesSql;

	public Long getTransfusionFilterCodes() {
		return transfusionFilterCodes;
	}

	public void setTransfusionFilterCodes(Long transfusionFilterCodes) {
		this.transfusionFilterCodes = transfusionFilterCodes;
	}

	public String getTransfusionFilterCodesLabel() {
		return transfusionFilterCodesLabel;
	}

	public void setTransfusionFilterCodesLabel(String transfusionFilterCodesLabel) {
		this.transfusionFilterCodesLabel = transfusionFilterCodesLabel;
	}

	public String getTransfusionFilterCodesValue() {
		return transfusionFilterCodesValue;
	}

	public void setTransfusionFilterCodesValue(String transfusionFilterCodesValue) {
		this.transfusionFilterCodesValue = transfusionFilterCodesValue;
	}

	public String getTransfusionFilterCodesPath() {
		return transfusionFilterCodesPath;
	}

	public void setTransfusionFilterCodesPath(String transfusionFilterCodesPath) {
		this.transfusionFilterCodesPath = transfusionFilterCodesPath;
	}

	public String getTransfusionFilterCodesSql() {
		return transfusionFilterCodesSql;
	}

	public void setTransfusionFilterCodesSql(String transfusionFilterCodesSql) {
		this.transfusionFilterCodesSql = transfusionFilterCodesSql;
	}
	
}
