package com.bootcampjava.electricityservice.controllers.registration;

import com.bootcampjava.electricityservice.models.registration.Customer;

@Controller
public class ReistrationContoller {

	@RequestMapping("/registration")
    public String registratation(@ModelAttribute("customer") Customer customer) {		
       
		
		return "success";
    }
}