package com.javaweb.ch12.dao;

//底层（数据访问层）层操作员登录系统接口文件
import com.javaweb.ch12.model.Operator;

public interface ILoginDAO {
	/*
	 * 判断是操作员是否存在参数:用户名，密码返回值:操作号PO对象
	 */
	public Operator isOperator(String operatorName, String operatorPwd);
}
