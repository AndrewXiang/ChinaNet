package com.javaweb.ch12.dao.impl;

//实现底层（数据访问层）层操作员（管理员）管理系统接口
import java.sql.*;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javaweb.ch12.dao.IAdminOperatorDAO;
import com.javaweb.ch12.model.Charge;
import com.javaweb.ch12.model.Charge_rule;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.Operator;

public class AdminOperatorDAOImp implements IAdminOperatorDAO {
	// hibernate　SessionFactory对象，由spring注入．
	private SessionFactory factory;

	// 增加操作员
	public boolean addOperator(Operator operator) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(operator);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// 增加业务收费
	public boolean addChargeRule(Charge_rule rule) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(rule);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// 删除原有业务收费
	public boolean delAllChargeRule(String business) {
		boolean isok = true;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Connection conn = session.connection();
		try {
			Statement state = conn.createStatement();
			int i = state
					.executeUpdate("delete from Charge_rule where FUNC_ID='"
							+ business + "'");
			if (i == 0) {
				isok = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ts.commit();
		session.close();
		return true;
	}

	// 设置收费细项
	public boolean setMoney(Charge charge) {
		boolean isok = true;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		System.out.println(charge.getChargeCode());
		Connection conn = session.connection();

		try {
			Statement state = conn.createStatement();
			int i = state.executeUpdate("update Charge set charge="
					+ charge.getCharge() + " where charge_code='"
					+ charge.getChargeCode() + "'");
			if (i == 0) {
				isok = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ts.commit();
		session.close();
		return isok;
	}

	// 判断操作员是否存在
	public boolean isOperatorExist(Operator operator) {
		boolean isExist = false;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session
				.createQuery("from Operator t where t.operatorId="
						+ operator.getOperatorId() + "");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			isExist = true;
		}
		ts.commit();
		session.close();
		return isExist;
	}

	// 增加手机号码
	public boolean addNumber(Mobile mobile) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(mobile);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// 判断手机卡号是否存在
	public boolean isCardExist(String cardnumber) {
		boolean isExist = false;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session
				.createQuery("from Mobile t where t.cardNumber='"
						+ cardnumber + "'");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			isExist = true;
		}
		ts.commit();
		session.close();
		return isExist;
	}

	// 判断手机号是否存在
	public boolean isMobileExist(String mobilenumber) {
		boolean isExist = false;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session
				.createQuery("from Mobile t where t.mobileNumber='"
						+ mobilenumber + "'");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			isExist = true;
		}
		ts.commit();
		session.close();
		return isExist;
	}

	// get/set方法在spring注入时使用
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
