package com.javaweb.ch12.model;

/**
 * user entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Customer customer;
	private Mobile mobile;
	private String roamingStatus;
	private String comLevel;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public User(Integer userId, Customer customer, Mobile mobile,
			String roamingStatus, String comLevel) {
		this.userId = userId;
		this.customer = customer;
		this.mobile = mobile;
		this.roamingStatus = roamingStatus;
		this.comLevel = comLevel;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Mobile getMobile() {
		return this.mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public String getRoamingStatus() {
		return this.roamingStatus;
	}

	public void setRoamingStatus(String roamingStatus) {
		this.roamingStatus = roamingStatus;
	}

	public String getComLevel() {
		return this.comLevel;
	}

	public void setComLevel(String comLevel) {
		this.comLevel = comLevel;
	}

}