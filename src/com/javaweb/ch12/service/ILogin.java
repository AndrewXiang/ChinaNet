package com.javaweb.ch12.service;

//ҵ������Ա��¼ϵͳ�ӿ��ļ�

import com.javaweb.ch12.model.Operator;

public interface ILogin {
	/*
	 * �ж��û��Ƿ����,����û�����,�򷵻��û�����:�û���,���뷵��ֵ:����ԱPO����
	 */
	public Operator isOperator(String operatorName, String operatorPwd);
}
