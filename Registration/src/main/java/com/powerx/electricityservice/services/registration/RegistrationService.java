package com.powerx.electricityservice.services.registration;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.powerx.electricityservice.clients.restclient.CustomerClient;
import com.powerx.electricityservice.clients.soapclient.ServicePlanClient;
import com.powerx.electricityservice.daos.registration.RegistrationDAO;
import com.powerx.electricityservice.jms.MessageSender;
import com.powerx.electricityservice.models.Customer;
import com.powerx.electricityservice.soapservice.ServicePlan;



public class RegistrationService {

	@Autowired
	RegistrationDAO regDAO;

	@Autowired
	CustomerClient custClient;

	@Autowired
	ServicePlanClient serviceClient;

	@Autowired
	MessageSender messageSender;
	final static Logger logger = Logger.getLogger(RegistrationService.class);

	@Transactional
	public String saveCustomer(Customer customer) {
		int custId = regDAO.saveCustomer(customer);

		String messege = null;
		if (custId != 0) {
			logger.info("Customer Saved Sccessfully with id " + custId);

			Customer cust = custClient.getCustomerById(custId);

			logger.info("REST call successfully got the customer " + cust.toString());

			List<ServicePlan> servicePlansList = serviceClient.getServicePlans();

			logger.info("SOAP call successfully got the Serviceplans ");

			messageSender.sendMessage(custId + " " + servicePlansList.get(2).getId());

			messege = "Name " + servicePlansList.get(2).getServicePlan() + " & Ends on "
					+ servicePlansList.get(2).getEndDate() ;

			return messege;
		} else {
			return messege;
		}
	}
}
