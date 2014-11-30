package com.javaweb.ch12.struts.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.javaweb.ch12.model.Charge;
import com.javaweb.ch12.service.IAdminOperator;

/**
 * 功能:设置收费项目
 */
public class EditChargeAction extends BaseAction {
	/*
	 * Generated fields
	 */

	/** charge property */
	private String charge;

	/** chargeCode property */
	private String chargeCode;
	/** 
	 * Returns the charge.
	 * @return String
	 */
	public String getCharge() {
		return charge;
	}

	/** 
	 * Set the charge.
	 * @param charge The charge to set
	 */
	public void setCharge(String charge) {
		this.charge = charge;
	}

	/** 
	 * Returns the chargeCode.
	 * @return String
	 */
	public String getChargeCode() {
		return chargeCode;
	}

	/** 
	 * Set the chargeCode.
	 * @param chargeCode The chargeCode to set
	 */
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	
	public String execute(){
		Charge charges = new Charge();
        charges.setCharge(Double.valueOf(charge));
		charges.setChargeCode(chargeCode);
		//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//从容器接管bean
		IAdminOperator admin = (IAdminOperator) context.getBean("adminservice");
		// System.out.println("hello!");
		// 调用业务层方法设置收费细项
		String message = admin.setMoney(charges);
		System.out.println(message);
		if (!message.equals("")) {
			this.request().setAttribute("message", message);
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
}