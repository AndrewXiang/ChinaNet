package com.javaweb.ch12.model;

import java.util.HashSet;
import java.util.Set;

/**
 * customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private String idType;
	private String idNumber;
	private String customerName;
	private String customerBirtyday;
	private String customerSex;
	private String customerAddress;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerId) {
		this.customerId = customerId;
	}

	/** full constructor */
	public Customer(Integer customerId, String idType, String idNumber,
			String customerName, String customerBirtyday, String customerSex,
			String customerAddress, Set users) {
		this.customerId = customerId;
		this.idType = idType;
		this.idNumber = idNumber;
		this.customerName = customerName;
		this.customerBirtyday = customerBirtyday;
		this.customerSex = customerSex;
		this.customerAddress = customerAddress;
		this.users = users;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerBirtyday() {
		return this.customerBirtyday;
	}

	public void setCustomerBirtyday(String customerBirtyday) {
		this.customerBirtyday = customerBirtyday;
	}

	public String getCustomerSex() {
		return this.customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}