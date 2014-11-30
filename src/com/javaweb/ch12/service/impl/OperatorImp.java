package com.javaweb.ch12.service.impl;

//实现业务层操作员受理业务接口
import com.javaweb.ch12.dao.IOperatorDAO;
import com.javaweb.ch12.model.Customer;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.User;
import com.javaweb.ch12.service.IOperator;

public class OperatorImp implements IOperator {
	// 数据访问层操作员受理业务对象,由spring注入(托管)
	private IOperatorDAO operator;

	// 增加客户
	public Customer addCustomer(Customer customer) {
		Customer mycustomer = null;
		if (operator.isCustomerExist(customer) == null) {
			mycustomer = operator.addCustomer(customer);
		}
		return mycustomer;
	}

	// 增加手机用户
	public String addUser(User user) {
		String message = "";
		// 先判断用机号是否可用
		if (operator.isMobileCanUse(user.getMobile().getMobileNumber()) != null) {
			if (operator.addUser(user)) {// 增加手机用户
				message = "添加用户成功!";
			} else {
				message = "添加用户失败!请您重新操作!";
			}
		} else {
			message = "添加用户失败!该手机号已被占用!";
		}
		return message;
	}

	// 判断客户是否存在
	public Customer isCustomerExist(Customer customer) {
		return operator.isCustomerExist(customer);
	}

	// 判断手机号是否可用
	public Mobile isMobileCanUse(String mnb) {
		System.out.println(mnb);
		return operator.isMobileCanUse(mnb);
	}

	// get/set方法在spring注入时使用
	public IOperatorDAO getOperator() {
		return operator;
	}

	public void setOperator(IOperatorDAO operator) {
		this.operator = operator;
	}
}
