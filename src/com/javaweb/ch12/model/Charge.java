package com.javaweb.ch12.model;

import java.util.HashSet;
import java.util.Set;

/**
 * charge entity. @author MyEclipse Persistence Tools
 */

public class Charge implements java.io.Serializable {

	// Fields

	private String chargeCode;
	private String chargeName;
	private Double charge;
	private Set charge_rule = new HashSet(0);

	// Constructors

	/** default constructor */
	public Charge() {
	}

	/** minimal constructor */
	public Charge(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	/** full constructor */
	public Charge(String chargeCode, String chargeName, Double charge,
			Set charge_rule) {
		this.chargeCode = chargeCode;
		this.chargeName = chargeName;
		this.charge = charge;
		this.charge_rule = charge_rule;
	}

	// Property accessors

	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getChargeName() {
		return this.chargeName;
	}

	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public Double getCharge() {
		return this.charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	public Set getCharge_rule() {
		return this.charge_rule;
	}

	public void setCharge_rule(Set charge_rule) {
		this.charge_rule = charge_rule;
	}

}