package com.javaweb.ch12.dao.impl;

//ʵ�ֵײ㣨���ݷ��ʲ㣩�����Ա������Ա������ϵͳ�ӿ�
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
	// hibernate��SessionFactory������springע�룮
	private SessionFactory factory;

	// ���Ӳ���Ա
	public boolean addOperator(Operator operator) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(operator);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// ����ҵ���շ�
	public boolean addChargeRule(Charge_rule rule) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(rule);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// ɾ��ԭ��ҵ���շ�
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

	// �����շ�ϸ��
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

	// �жϲ���Ա�Ƿ����
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

	// �����ֻ�����
	public boolean addNumber(Mobile mobile) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(mobile);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// �ж��ֻ������Ƿ����
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

	// �ж��ֻ����Ƿ����
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

	// get/set������springע��ʱʹ��
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
