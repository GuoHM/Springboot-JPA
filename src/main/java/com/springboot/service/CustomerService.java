package com.springboot.service;

import java.util.List;

import com.springboot.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(String id);
	
	public Customer insertOrUpdate(Customer customer);
	
	public void delete(String id);

}
