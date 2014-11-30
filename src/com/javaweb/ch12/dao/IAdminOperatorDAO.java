package com.javaweb.ch12.dao;

import com.javaweb.ch12.model.Charge;
import com.javaweb.ch12.model.Charge_rule;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.Operator;

//底层（数据访问层）层操作员（管理员）管理系统接口文件

public interface IAdminOperatorDAO {
	/*
	 * 增加操作员参数:操作员PO对象返回值:boolean
	 */
	public boolean addOperator(Operator operator);

	/*
	 * 判断操作员是否存在参数:操作员PO对象返回值:boolean
	 */
	public boolean isOperatorExist(Operator operator);

	/*
	 * 增加手机号码参数:手机号PO对象返回值:boolean
	 */
	public boolean addNumber(Mobile mobile);

	/*
	 * 判断手机号是否存在参数:手机号码返回值:boolean
	 */
	public boolean isMobileExist(String mobilenumber);

	/*
	 * 判断手机卡号是否存在参数:手机卡号返回值:boolean
	 */
	public boolean isCardExist(String cardnumber);

	/*
	 * 设置收费细项参数:收费细项PO对象返回值:boolean
	 */
	public boolean setMoney(Charge charge);

	/*
	 * 增加业务收费参数:业务PO对象返回值:boolean
	 */
	public boolean addChargeRule(Charge_rule rule);

	/*
	 * 删除原有业务收费参数:业务类型返回值:boolean
	 */
	public boolean delAllChargeRule(String business);
}
