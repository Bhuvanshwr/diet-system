package com.diet.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String fullname ;
	@Column
	private String age;
	@Column
	private String gender;
	@Column
	private String phonenumber;
	@Column
	private String emailaddress;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private String pincode;
	@Column
	private String height;
	@Column
	private String weight;
	@Column
	private String bmi;
	@Column
	private String reasonforjoiningthisprogram;
	@Column
	private String anyexistingmedicalconditions;
	@Column
	private String anyexistingdietaryrestrictions;
	@Column
	private String dietarycustom ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBmi() {
		return bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	public String getReasonforjoiningthisprogram() {
		return reasonforjoiningthisprogram;
	}
	public void setReasonforjoiningthisprogram(String reasonforjoiningthisprogram) {
		this.reasonforjoiningthisprogram = reasonforjoiningthisprogram;
	}
	public String getAnyexistingmedicalconditions() {
		return anyexistingmedicalconditions;
	}
	public void setAnyexistingmedicalconditions(String anyexistingmedicalconditions) {
		this.anyexistingmedicalconditions = anyexistingmedicalconditions;
	}
	public String getAnyexistingdietaryrestrictions() {
		return anyexistingdietaryrestrictions;
	}
	public void setAnyexistingdietaryrestrictions(String anyexistingdietaryrestrictions) {
		this.anyexistingdietaryrestrictions = anyexistingdietaryrestrictions;
	}
	public String getDietarycustom() {
		return dietarycustom;
	}
	public void setDietarycustom(String dietarycustom) {
		this.dietarycustom = dietarycustom;
	}
	public String getPregnantstatus() {
		return pregnantstatus;
	}
	public void setPregnantstatus(String pregnantstatus) {
		this.pregnantstatus = pregnantstatus;
	}
	public String getReferralcode() {
		return referralcode;
	}
	public void setReferralcode(String referralcode) {
		this.referralcode = referralcode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column
	private String pregnantstatus ;
	@Column
	private String referralcode;
	@Column
	private String status;
}
