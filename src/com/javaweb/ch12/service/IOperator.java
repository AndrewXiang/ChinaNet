package com.javaweb.ch12.service;

//ҵ������Ա����ҵ��ӿ��ļ�
import com.javaweb.ch12.model.*;

public interface IOperator {
	/*
	 * �жϿͻ��Ƿ���ڲ���:�ͻ�PO���󷵻�ֵ:�ͻ�PO����
	 */
	public Customer isCustomerExist(Customer customer);

	/*
	 * ���ӿͻ�����:�ͻ�PO���󷵻�ֵ:�ͻ�PO����
	 */
	public Customer addCustomer(Customer customer);

	/*
	 * �ж��ֻ����Ƿ���ò���:�ֻ����뷵��ֵ:�ֻ�PO����
	 */
	public Mobile isMobileCanUse(String mnb);

	/*
	 * �����ֻ��û�����:�ֻ��û�PO���󷵻�ֵ:�����ɹ������Ϣ
	 */
	public String addUser(User user);
}
