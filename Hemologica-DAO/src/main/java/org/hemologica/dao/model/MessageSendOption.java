package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the cities_codes database table.
 * 
 */
@Entity
@Table(name="message_send_Option")
@NamedQuery(name="MessageSendOption.findAll", query="SELECT c FROM MessageSendOption c")
public class MessageSendOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private String id;

	@Column(name="label")
	private String label;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}