package com.javaweb.ch12.service.impl;

//ʵ��ҵ������Ա��¼ϵͳ�ӿ�
import com.javaweb.ch12.dao.ILoginDAO;
import com.javaweb.ch12.model.Operator;
import com.javaweb.ch12.service.ILogin;

public class LoginImp implements ILogin {
	// ���ݷ��ʲ����Ա��¼����,��springע��(�й�)
	private ILoginDAO login;

	// �ж��û��Ƿ����,����û�����,�򷵻��û�
	public Operator isOperator(String operatorName, String operatorPwd) {
		return login.isOperator(operatorName, operatorPwd);
	}

	// get/set������springע��ʱʹ��
	public ILoginDAO getLogin() {
		return login;
	}

	public void setLogin(ILoginDAO login) {
		this.login = login;
	}
}
