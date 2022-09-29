package com.greatlearning.CustomerRelationshipManagement.service;

import java.util.List;

import com.greatlearning.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {
	
	
	public List<Customer> findAll();
	public Customer findById(int theId); 
	public void save(Customer theCustomer);
	public void DeleteById(int theId);
	

}
