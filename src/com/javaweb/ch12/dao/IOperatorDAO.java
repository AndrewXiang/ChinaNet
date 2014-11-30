package com.javaweb.ch12.dao;

import com.javaweb.ch12.model.Customer;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.User;


//�ײ㣨���ݷ��ʲ㣩�����Ա����ҵ��ӿ��ļ�
public interface IOperatorDAO {
	/*
	 * �жϿͻ��Ƿ���ڲ���:�ͻ�PO���󷵻�ֵ:�ͻ�PO����
	 */
	public Customer isCustomerExist(Customer customer);

	/*
	 * ���ӿͻ�����:�ͻ�PO���󷵻�ֵ:�ͻ�PO����
	 */
	public Customer addCustomer(Customer customer);

	/*
	 * �ж��ֻ����Ƿ���ò���:�ֻ��ŷ���ֵ:�ֻ�PO����
	 */
	public Mobile isMobileCanUse(String mnb);

	/*
	 * �����ֻ��û�����:�ֻ��û�PO���󷵻�ֵ:boolean
	 */
	public boolean addUser(User user);
}
