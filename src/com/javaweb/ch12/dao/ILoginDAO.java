package com.javaweb.ch12.dao;

//�ײ㣨���ݷ��ʲ㣩�����Ա��¼ϵͳ�ӿ��ļ�
import com.javaweb.ch12.model.Operator;

public interface ILoginDAO {
	/*
	 * �ж��ǲ���Ա�Ƿ���ڲ���:�û��������뷵��ֵ:������PO����
	 */
	public Operator isOperator(String operatorName, String operatorPwd);
}
