package com.javaweb.ch12.service;

//业务层操作员（管理员）管理系统接口文件
import com.javaweb.ch12.model.*;

public interface IAdminOperator {
	/*
	 * 增加操作员参数:操作员PO对象返回值:操作成功与否信息
	 */
	public String addOperator(Operator operator);

	/*
	 * 增加号段参数:号码类型,号码开始段,号码结束段返回值:操作成功与否信息
	 */
	public String addNumber(String nbtype, String StartMobile, String endMobile);

	/*
	 * 设置细项费用参数:细项费用PO对象返回值:操作成功与否信息
	 */
	public String setMoney(Charge charge);

	/*
	 * 业务收费设置参数:业务类别,收费项目数组返回值:操作成功与否信息
	 */
	public String editChargeRule(String rule, String[] charge);
}
