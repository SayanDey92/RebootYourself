/**
 * 
 */
package com.reboot.yourself.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author AyanD
 *
 */

@Entity
@Table(name = "user_profile", schema = "master")
public class UserProfile extends CommonModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id")
	private int profileId;
	
	@Column(name = "f_name")
	private String fName;
	
	@Column(name = "m_name")
	private String mName;
	
	@Column(name = "l_name")
	private String lName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "address_line1")
	private String addressLine1;
	
	@Column(name = "address_line2")
	private String addressLine2;
	
	@Column(name = "pan_number")
	private String panNumber;
	
	@Column(name = "aadhar_number")
	private String aadharNumber;
	
	@Column(name = "nationality")
	private String nationality;
	
	@OneToOne(cascade = CascadeType.ALL)
	private City city;
	
	@Column(name = "matirial_status")
	private String matirialStatus;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "occupation")
	private String occupation;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	private UserModel userModel;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

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

	/*public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}*/

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
}
