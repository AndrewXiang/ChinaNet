package com.javaweb.ch12.service;

//业务层操作员受理业务接口文件
import com.javaweb.ch12.model.*;

public interface IOperator {
	/*
	 * 判断客户是否存在参数:客户PO对象返回值:客户PO对象
	 */
	public Customer isCustomerExist(Customer customer);

	/*
	 * 增加客户参数:客户PO对象返回值:客户PO对象
	 */
	public Customer addCustomer(Customer customer);

	/*
	 * 判断手机号是否可用参数:手机号码返回值:手机PO对象
	 */
	public Mobile isMobileCanUse(String mnb);

	/*
	 * 增加手机用户参数:手机用户PO对象返回值:操作成功与否信息
	 */
	public String addUser(User user);
}
