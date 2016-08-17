package com.customerservice.customerdetails.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serviceplan")
public class ServicePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="service_plan", unique = true, nullable = true)
	private String service_plan;
	
	@Column(name="start_date", nullable = true)
	private String start_date;
	
	@Column(name="end_date", nullable = true)
	private String end_date;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getService_plan() {
		return service_plan;
	}
	public void setService_plan(String service_plan) {
		this.service_plan = service_plan;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
}
