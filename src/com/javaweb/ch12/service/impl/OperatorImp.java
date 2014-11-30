package com.javaweb.ch12.service.impl;

//ʵ��ҵ������Ա����ҵ��ӿ�
import com.javaweb.ch12.dao.IOperatorDAO;
import com.javaweb.ch12.model.Customer;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.User;
import com.javaweb.ch12.service.IOperator;

public class OperatorImp implements IOperator {
	// ���ݷ��ʲ����Ա����ҵ�����,��springע��(�й�)
	private IOperatorDAO operator;

	// ���ӿͻ�
	public Customer addCustomer(Customer customer) {
		Customer mycustomer = null;
		if (operator.isCustomerExist(customer) == null) {
			mycustomer = operator.addCustomer(customer);
		}
		return mycustomer;
	}

	// �����ֻ��û�
	public String addUser(User user) {
		String message = "";
		// ���ж��û����Ƿ����
		if (operator.isMobileCanUse(user.getMobile().getMobileNumber()) != null) {
			if (operator.addUser(user)) {// �����ֻ��û�
				message = "����û��ɹ�!";
			} else {
				message = "����û�ʧ��!�������²���!";
			}
		} else {
			message = "����û�ʧ��!���ֻ����ѱ�ռ��!";
		}
		return message;
	}

	// �жϿͻ��Ƿ����
	public Customer isCustomerExist(Customer customer) {
		return operator.isCustomerExist(customer);
	}

	// �ж��ֻ����Ƿ����
	public Mobile isMobileCanUse(String mnb) {
		System.out.println(mnb);
		return operator.isMobileCanUse(mnb);
	}

	// get/set������springע��ʱʹ��
	public IOperatorDAO getOperator() {
		return operator;
	}

	public void setOperator(IOperatorDAO operator) {
		this.operator = operator;
	}
}
