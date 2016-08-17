package com.customerservice.customerdetails.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.customerservice.customerdetails.model.Customer;
import com.customerservice.customerdetails.service.CustomerService;

@Path("/cust")
@Produces("application/json")
public class CustomerServiceWS {

	
	
	  @GET
	  @Path("{id : \\d+}")
	  @Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerDetails(@PathParam("id") int id) {

		CustomerService custService = new CustomerService();

		Customer customer = custService.getCustomerDetails(id);
		
		return customer;
	}
	
}
