package com.javaweb.ch12.service;

//ҵ������Ա������Ա������ϵͳ�ӿ��ļ�
import com.javaweb.ch12.model.*;

public interface IAdminOperator {
	/*
	 * ���Ӳ���Ա����:����ԱPO���󷵻�ֵ:�����ɹ������Ϣ
	 */
	public String addOperator(Operator operator);

	/*
	 * ���ӺŶβ���:��������,���뿪ʼ��,��������η���ֵ:�����ɹ������Ϣ
	 */
	public String addNumber(String nbtype, String StartMobile, String endMobile);

	/*
	 * ����ϸ����ò���:ϸ�����PO���󷵻�ֵ:�����ɹ������Ϣ
	 */
	public String setMoney(Charge charge);

	/*
	 * ҵ���շ����ò���:ҵ�����,�շ���Ŀ���鷵��ֵ:�����ɹ������Ϣ
	 */
	public String editChargeRule(String rule, String[] charge);
}
