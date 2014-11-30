package com.javaweb.ch12.dao.impl;

//实现底层（数据访问层）层操作员登录系统接口
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
	// hibernate　SessionFactory对象，由spring注入．
	private SessionFactory factory;

	// get/set方法在spring注入时使用
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	// 判断是操作员是否存在
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
