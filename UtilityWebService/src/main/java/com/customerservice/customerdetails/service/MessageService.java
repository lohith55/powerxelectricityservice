package com.customerservice.customerdetails.service;

import com.customerservice.customerdetails.dao.MessageServiceDao;

public class MessageService {

	public void setCustomerService(int c_id, int serv_id) {
	
		MessageServiceDao messServiceDao = new MessageServiceDao();
		messServiceDao.updateCustomer(c_id, serv_id);
		
	}
}
