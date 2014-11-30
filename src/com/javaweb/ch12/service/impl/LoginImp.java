package com.javaweb.ch12.service.impl;

//实现业务层操作员登录系统接口
import com.javaweb.ch12.dao.ILoginDAO;
import com.javaweb.ch12.model.Operator;
import com.javaweb.ch12.service.ILogin;

public class LoginImp implements ILogin {
	// 数据访问层操作员登录对象,由spring注入(托管)
	private ILoginDAO login;

	// 判断用户是否存在,如果用户存在,则返回用户
	public Operator isOperator(String operatorName, String operatorPwd) {
		return login.isOperator(operatorName, operatorPwd);
	}

	// get/set方法在spring注入时使用
	public ILoginDAO getLogin() {
		return login;
	}

	public void setLogin(ILoginDAO login) {
		this.login = login;
	}
}
