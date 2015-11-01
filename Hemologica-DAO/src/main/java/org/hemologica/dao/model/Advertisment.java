package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the advertisments database table.
 * 
 */
@Entity
@Table(name="advertisments")
@NamedQuery(name="Advertisment.findAll", query="SELECT a FROM Advertisment a")
public class Advertisment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to AdvertismentsContent
	@OneToMany(mappedBy="advertisment")
	private List<AdvertismentsContent> advertismentsContents;

	public Advertisment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

}