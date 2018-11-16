/**
 * 
 */
package com.reboot.yourself.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author AyanD
 *
 */
@Entity
@Table(name = "country", schema = "master")
public class Country extends CommonModel {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "country_id")
	private int countryId;
	
	@Column(name = "country_name")
	private String countryName;
	
	@OneToMany(mappedBy = "country", fetch=FetchType.LAZY)
	private List<State> states = new ArrayList<State>(0);

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
}
