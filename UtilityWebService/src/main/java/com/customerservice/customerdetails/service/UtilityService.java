package com.customerservice.customerdetails.service;

import java.util.List;

import com.customerservice.customerdetails.dao.ServicePlanDAO;
import com.customerservice.customerdetails.model.ServicePlan;

public class UtilityService {

	public List<ServicePlan> getServicePlan() {
		ServicePlanDAO servicePlanDAO = new ServicePlanDAO();

		 List<ServicePlan> servicePlans = servicePlanDAO.getServicePlanDAO();

		return servicePlans;
	}
}
