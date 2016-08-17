package com.customerservice.customerdetails.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.customerservice.customerdetails.model.ServicePlan;
import com.customerservice.customerdetails.util.HIbernateUtil;

public class ServicePlanDAO {
	
	@SuppressWarnings("unchecked")
	public List<ServicePlan> getServicePlanDAO(){
		
		List<ServicePlan> serviceList = new ArrayList<ServicePlan>();
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		try {
			session.getTransaction().begin();
			serviceList = session.createQuery("from ServicePlan").list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.close();
		} 
		
		if(serviceList.isEmpty()){
			return null;
		}
		else{
			return serviceList;	
		}
		
	}

}
