package com.javaweb.ch12.dao.impl;

//实现底层（数据访问层）层操作员受理业务接口
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javaweb.ch12.dao.IOperatorDAO;
import com.javaweb.ch12.model.Customer;
import com.javaweb.ch12.model.Mobile;
import com.javaweb.ch12.model.User;

public class OperatorDAOImp implements IOperatorDAO {
	// hibernate　SessionFactory对象，由spring注入．
	private SessionFactory factory;

	// 增加客户
	public Customer addCustomer(Customer customer) {
		Customer mycustomer = null;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(customer);
		ts.commit();
		Transaction ts1 = session.beginTransaction();
		Query query = session.createQuery("from Customer t where t.idNumber='"
				+ customer.getIdNumber() + "'");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			mycustomer = (Customer) it.next();
		}
		ts1.commit();
		session.close();
		return mycustomer;
	}

	// 增加手机用户
	public boolean addUser(User user) {
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(user);
		Mobile mobile = (Mobile) session.get(Mobile.class, user
				.getMobile().getMobileNumber());
		mobile.setIsAvailable("N");
		session.update(mobile);
		ts.commit();
		boolean isok = ts.wasCommitted();
		session.close();
		return isok;
	}

	// 判断客户是否存在
	public Customer isCustomerExist(Customer customer) {
		Customer mycustomer = null;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session.createQuery("from Customer t where t.idNumber='"
				+ customer.getIdNumber() + "'");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			mycustomer = (Customer) it.next();
		}
		ts.commit();
		session.close();
		return mycustomer;
	}

	// 判断手机号是否可用
	public Mobile isMobileCanUse(String mobile) {
		Mobile mymobile = null;
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session
				.createQuery("from Mobile t where t.mobileNumber='" + mobile
						+ "' and t.isAvailable='Y'");
		List list = query.list();
		Iterator it = list.iterator();
		if (it.hasNext()) {
			mymobile = (Mobile) it.next();
		}
		ts.commit();
		session.close();
		return mymobile;
	}

	// get/set方法在spring注入时使用
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
