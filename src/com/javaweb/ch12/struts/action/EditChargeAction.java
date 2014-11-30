package com.javaweb.ch12.struts.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.javaweb.ch12.model.Charge;
import com.javaweb.ch12.service.IAdminOperator;

/**
 * ����:�����շ���Ŀ
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
		//����Spring�����ļ�����ʼ��IOC����
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//�������ӹ�bean
		IAdminOperator admin = (IAdminOperator) context.getBean("adminservice");
		// System.out.println("hello!");
		// ����ҵ��㷽�������շ�ϸ��
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