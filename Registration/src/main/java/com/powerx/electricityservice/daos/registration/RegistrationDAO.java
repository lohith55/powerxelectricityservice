package com.powerx.electricityservice.daos.registration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.powerx.electricityservice.models.Customer;




@Repository
public class RegistrationDAO{
	
	@Autowired
	private SessionFactory mySessionFactory;

	public int saveCustomer(Customer customer) {	
		Session session = mySessionFactory.getCurrentSession();	
		Transaction trans = session.beginTransaction();
		int custId = (Integer) session.save(customer);	
		trans.commit();
		return custId;
	}
}
