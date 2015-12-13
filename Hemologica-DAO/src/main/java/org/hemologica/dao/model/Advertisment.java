package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Calendar;
import java.util.List;


/**
 * The persistent class for the advertisments database table.
 * 
 */
@Entity
@Table(name="advertisments")
@NamedQueries({
@NamedQuery(name="Advertisment.findAll", query="SELECT a FROM Advertisment a"),
@NamedQuery(name="Advertisment.findLimit", query="SELECT a FROM Advertisment a ORDER BY a.date DESC"),
@NamedQuery(name="Advertisment.findById", query="SELECT a FROM Advertisment a WHERE a.id = :id")
})
public class Advertisment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="advertisment_title")
	private String title;
	
	@Column(name="advertisment_subtitle")
	private String subtitle;
	
	@Column(name="advertisment_summary")
	@Lob
	private String summary;
	
	@Column(name="advertisment_text")
	@Lob
	private String text;
	
	@Column(name="advertisment_date")
	@Temporal(TemporalType.DATE)
	private Calendar date;
	
	
	//bi-directional many-to-one association to AdvertismentsContent
	@OneToMany(mappedBy="advertisment")
	private List<AdvertismentsContent> advertismentsContents;

	public Advertisment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<AdvertismentsContent> getAdvertismentsContents() {
		return this.advertismentsContents;
	}

	public void setAdvertismentsContents(List<AdvertismentsContent> advertismentsContents) {
		this.advertismentsContents = advertismentsContents;
	}

	public AdvertismentsContent addAdvertismentsContent(AdvertismentsContent advertismentsContent) {
		getAdvertismentsContents().add(advertismentsContent);
		advertismentsContent.setAdvertisment(this);

		return advertismentsContent;
	}

	public AdvertismentsContent removeAdvertismentsContent(AdvertismentsContent advertismentsContent) {
		getAdvertismentsContents().remove(advertismentsContent);
		advertismentsContent.setAdvertisment(null);

		return advertismentsContent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

}