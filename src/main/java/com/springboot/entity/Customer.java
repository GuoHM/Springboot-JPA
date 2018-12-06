package com.springboot.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the Customers database table.
 * 
 */
@Entity
@Table(name = "Customers")
@Cacheable
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private String customerID;
	private String address;
	private String city;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String country;
	private String fax;
	private String phone;
	private String postalCode;
	private String region;

	public Customer() {
	}

	@Id
	@Column(name = "CustomerID")
	public String getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	@Column(name = "Address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "City")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CompanyName")
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "contactname")
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "contacttitle")
	public String getContactTitle() {
		return this.contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	@Column(name = "Country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "Fax")
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "Phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "postalcode")
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "Region")
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", address=" + address + ", city=" + city + ", companyName=" + companyName + ", contactName=" + contactName + ", contactTitle=" + contactTitle
				+ ", country=" + country + ", fax=" + fax + ", phone=" + phone + ", postalCode=" + postalCode + ", region=" + region + "]";
	}



}