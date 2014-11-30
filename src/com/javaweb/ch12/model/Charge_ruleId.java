package com.javaweb.ch12.model;

/**
 * charge_ruleId entity. @author MyEclipse Persistence Tools
 */

public class Charge_ruleId implements java.io.Serializable {

	// Fields

	private String funcId;
	private Charge charge;
	private String funcName;

	// Constructors

	/** default constructor */
	public Charge_ruleId() {
	}

	/** minimal constructor */
	public Charge_ruleId(String funcId) {
		this.funcId = funcId;
	}

	/** full constructor */
	public Charge_ruleId(String funcId, Charge charge, String funcName) {
		this.funcId = funcId;
		this.charge = charge;
		this.funcName = funcName;
	}

	// Property accessors

	public String getFuncId() {
		return this.funcId;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}

	public Charge getCharge() {
		return this.charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

	public String getFuncName() {
		return this.funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Charge_ruleId))
			return false;
		Charge_ruleId castOther = (Charge_ruleId) other;

		return ((this.getFuncId() == castOther.getFuncId()) || (this
				.getFuncId() != null
				&& castOther.getFuncId() != null && this.getFuncId().equals(
				castOther.getFuncId())))
				&& ((this.getCharge() == castOther.getCharge()) || (this
						.getCharge() != null
						&& castOther.getCharge() != null && this.getCharge()
						.equals(castOther.getCharge())))
				&& ((this.getFuncName() == castOther.getFuncName()) || (this
						.getFuncName() != null
						&& castOther.getFuncName() != null && this
						.getFuncName().equals(castOther.getFuncName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFuncId() == null ? 0 : this.getFuncId().hashCode());
		result = 37 * result
				+ (getCharge() == null ? 0 : this.getCharge().hashCode());
		result = 37 * result
				+ (getFuncName() == null ? 0 : this.getFuncName().hashCode());
		return result;
	}

}