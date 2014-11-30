package com.javaweb.ch12.model;

/**
 * charge_rule entity. @author MyEclipse Persistence Tools
 */

public class Charge_rule implements java.io.Serializable {

	// Fields

	private Charge_ruleId id;
	private Charge charge;

	// Constructors

	/** default constructor */
	public Charge_rule() {
	}

	/** minimal constructor */
	public Charge_rule(Charge_ruleId id) {
		this.id = id;
	}

	/** full constructor */
	public Charge_rule(Charge_ruleId id, Charge charge) {
		this.id = id;
		this.charge = charge;
	}

	// Property accessors

	public Charge_ruleId getId() {
		return this.id;
	}

	public void setId(Charge_ruleId id) {
		this.id = id;
	}

	public Charge getCharge() {
		return this.charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

}