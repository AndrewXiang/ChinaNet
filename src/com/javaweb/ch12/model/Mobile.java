package com.javaweb.ch12.model;

import java.util.HashSet;
import java.util.Set;

/**
 * mobile entity. @author MyEclipse Persistence Tools
 */

public class Mobile implements java.io.Serializable {

	// Fields

	private String mobileNumber;
	private String mobileType;
	private String cardNumber;
	private String isAvailable;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Mobile() {
	}

	/** minimal constructor */
	public Mobile(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/** full constructor */
	public Mobile(String mobileNumber, String mobileType, String cardNumber,
			String isAvailable, Set users) {
		this.mobileNumber = mobileNumber;
		this.mobileType = mobileType;
		this.cardNumber = cardNumber;
		this.isAvailable = isAvailable;
		this.users = users;
	}

	// Property accessors

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileType() {
		return this.mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}