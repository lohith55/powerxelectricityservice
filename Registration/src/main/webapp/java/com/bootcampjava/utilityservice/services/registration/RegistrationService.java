package com.bootcampjava.electricityservice.services.registration;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootcampjava.electricityservice.daos.registration.RegistrationDao;

public class RegistrationService {
	
	@Autowired
	RegistrationDao rdao;

	public void setRdao(RegistrationDao rdao) {
		this.rdao = rdao;
	}
	
}
