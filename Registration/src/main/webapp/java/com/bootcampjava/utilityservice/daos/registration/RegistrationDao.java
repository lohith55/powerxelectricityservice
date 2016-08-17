package com.bootcampjava.electricityservice.daos.registration;

import com.bootcampjava.electricityservice.models.registration.Customer;

public interface RegistrationDao {
	public boolean saveCustomer(Customer Customer);
}
