/**
 * 
 */
package com.reboot.yourself.vo.resvo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AyanD
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileResVo{

	@JsonProperty("profileId")
	private Integer profileId;
	
	@JsonProperty("fName")
	private String fName;
	
	@JsonProperty("mName")
	private String mName;
	
	@JsonProperty("lName")
	private String lName;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	@JsonProperty("sex")
	private String sex;
	
	@JsonProperty("addressLine1")
	private String addressLine1;
	
	@JsonProperty("addressLine2")
	private String addressLine2;
	
	@JsonProperty("panNumber")
	private String panNumber;
	
	@JsonProperty("aadharNumber")
	private String aadharNumber;
	
	@JsonProperty("nationality")
	private String nationality;
	
	@JsonProperty("city")
	private Integer city;
	
	@JsonProperty("matirialStatus")
	private String matirialStatus;
	
	@JsonProperty("companyName")
	private String companyName;
	
	@JsonProperty("jobTitle")
	private String jobTitle;
	
	@JsonProperty("occupation")
	private String occupation;
	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public String getMatirialStatus() {
		return matirialStatus;
	}

	public void setMatirialStatus(String matirialStatus) {
		this.matirialStatus = matirialStatus;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
}
