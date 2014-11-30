package com.javaweb.ch12.model;

/**
 * operator entity. @author MyEclipse Persistence Tools
 */

public class Operator implements java.io.Serializable {

	// Fields

	private Integer operatorId;
	private String operatorName;
	private String operatorPwd;
	private Integer isAdmin;

	// Constructors

	/** default constructor */
	public Operator() {
	}

	/** minimal constructor */
	public Operator(Integer operatorId) {
		this.operatorId = operatorId;
	}

	/** full constructor */
	public Operator(Integer operatorId, String operatorName,
			String operatorPwd, Integer isAdmin) {
		this.operatorId = operatorId;
		this.operatorName = operatorName;
		this.operatorPwd = operatorPwd;
		this.isAdmin = isAdmin;
	}

	// Property accessors

	public Integer getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorPwd() {
		return this.operatorPwd;
	}

	public void setOperatorPwd(String operatorPwd) {
		this.operatorPwd = operatorPwd;
	}

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

}