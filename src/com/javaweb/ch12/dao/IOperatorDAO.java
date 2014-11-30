package com.javaweb.ch12.dao;

import com.javaweb.ch12.model.Customer;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.User;


//底层（数据访问层）层操作员受理业务接口文件
public interface IOperatorDAO {
	/*
	 * 判断客户是否存在参数:客户PO对象返回值:客户PO对象
	 */
	public Customer isCustomerExist(Customer customer);

	/*
	 * 增加客户参数:客户PO对象返回值:客户PO对象
	 */
	public Customer addCustomer(Customer customer);

	/*
	 * 判断手机号是否可用参数:手机号返回值:手机PO对象
	 */
	public Mobile isMobileCanUse(String mnb);

	/*
	 * 增加手机用户参数:手机用户PO对象返回值:boolean
	 */
	public boolean addUser(User user);
}
