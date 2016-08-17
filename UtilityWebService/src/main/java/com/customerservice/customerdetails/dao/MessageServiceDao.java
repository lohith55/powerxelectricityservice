package com.customerservice.customerdetails.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.customerservice.customerdetails.util.HIbernateUtil;

public class MessageServiceDao {
	SessionFactory sessionFactory = HIbernateUtil.getSessionFactory();
	Session session = sessionFactory.getCurrentSession();

	public boolean updateCustomer(int custId, int serviceId) {
		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("update Customer set serv_id = :serviceId where id = :custId");
		query.setParameter("serviceId", serviceId);
		query.setParameter("custId", custId);
		int result = query.executeUpdate();
		tx.commit();

		if (result == 1)
			return true;
		else
			return false;
	}
}
