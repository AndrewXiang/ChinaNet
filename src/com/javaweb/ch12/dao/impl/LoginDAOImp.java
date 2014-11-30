package com.javaweb.ch12.dao.impl;

//ʵ�ֵײ㣨���ݷ��ʲ㣩�����Ա��¼ϵͳ�ӿ�
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javaweb.ch12.dao.ILoginDAO;
import com.javaweb.ch12.model.Operator;

public class LoginDAOImp implements ILoginDAO {
	// hibernate��SessionFactory������springע�룮
	private SessionFactory factory;

	// get/set������springע��ʱʹ��
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	// �ж��ǲ���Ա�Ƿ����
	public Operator isOperator(String operatorName, String operatorPwd) {
		Operator operator = null;
		Session session = factory.openSession();
		Transaction ts = null;
		ts = session.beginTransaction();
		// String
		// query="select * from userInfo where userName=? and userPassword=?";
		try {
			Query query = session
					.createQuery("from Operator as a where a.operatorName='"
							+ operatorName + "' and a.operatorPwd='"
							+ operatorPwd + "'");
			List<Operator> list = query.list();
			Iterator it = list.iterator();
			if (!Hibernate.isInitialized(list))
				Hibernate.initialize(list);
			if (it.hasNext()) {
				operator = (Operator) it.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		ts.commit();
		session.close();
		return operator;
	}

	
}
