package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the geo_locations database table.
 * 
 */
@Entity
@Table(name="geo_locations")
@NamedQuery(name="GeoLocation.findAll", query="SELECT g FROM GeoLocation g")
public class GeoLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="geo_location_id")
	private String geoLocationId;

	@Column(name="geo_locations_x")
	private int geoLocationsX;

	@Column(name="geo_locations_y")
	private int geoLocationsY;

	//bi-directional many-to-one association to Center
	@OneToMany(mappedBy="geoLocation")
	private List<Center> centers;

	public GeoLocation() {
	}

	public String getGeoLocationId() {
		return this.geoLocationId;
	}

	public void setGeoLocationId(String geoLocationId) {
		this.geoLocationId = geoLocationId;
	}

	public int getGeoLocationsX() {
		return this.geoLocationsX;
	}

	public void setGeoLocationsX(int geoLocationsX) {
		this.geoLocationsX = geoLocationsX;
	}

	public int getGeoLocationsY() {
		return this.geoLocationsY;
	}

	public void setGeoLocationsY(int geoLocationsY) {
		this.geoLocationsY = geoLocationsY;
	}

	public List<Center> getCenters() {
		return this.centers;
	}

	public void setCenters(List<Center> centers) {
		this.centers = centers;
	}

	public Center addCenter(Center center) {
		getCenters().add(center);
		center.setGeoLocation(this);

		return center;
	}

	public Center removeCenter(Center center) {
		getCenters().remove(center);
		center.setGeoLocation(null);

		return center;
	}

}