package com.javaweb.ch12.dao;

import com.javaweb.ch12.model.Charge;
import com.javaweb.ch12.model.Charge_rule;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.Operator;

//�ײ㣨���ݷ��ʲ㣩�����Ա������Ա������ϵͳ�ӿ��ļ�

public interface IAdminOperatorDAO {
	/*
	 * ���Ӳ���Ա����:����ԱPO���󷵻�ֵ:boolean
	 */
	public boolean addOperator(Operator operator);

	/*
	 * �жϲ���Ա�Ƿ���ڲ���:����ԱPO���󷵻�ֵ:boolean
	 */
	public boolean isOperatorExist(Operator operator);

	/*
	 * �����ֻ��������:�ֻ���PO���󷵻�ֵ:boolean
	 */
	public boolean addNumber(Mobile mobile);

	/*
	 * �ж��ֻ����Ƿ���ڲ���:�ֻ����뷵��ֵ:boolean
	 */
	public boolean isMobileExist(String mobilenumber);

	/*
	 * �ж��ֻ������Ƿ���ڲ���:�ֻ����ŷ���ֵ:boolean
	 */
	public boolean isCardExist(String cardnumber);

	/*
	 * �����շ�ϸ�����:�շ�ϸ��PO���󷵻�ֵ:boolean
	 */
	public boolean setMoney(Charge charge);

	/*
	 * ����ҵ���շѲ���:ҵ��PO���󷵻�ֵ:boolean
	 */
	public boolean addChargeRule(Charge_rule rule);

	/*
	 * ɾ��ԭ��ҵ���շѲ���:ҵ�����ͷ���ֵ:boolean
	 */
	public boolean delAllChargeRule(String business);
}
