package com.javaweb.ch12.service;

//业务层操作员登录系统接口文件

import com.javaweb.ch12.model.Operator;

public interface ILogin {
	/*
	 * 判断用户是否存在,如果用户存在,则返回用户参数:用户名,密码返回值:操作员PO对象
	 */
	public Operator isOperator(String operatorName, String operatorPwd);
}
