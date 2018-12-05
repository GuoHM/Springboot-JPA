package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.CustomerDao;
import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    CustomerDao customerDao;

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public Customer findById(String id) {
		// TODO Auto-generated method stub
		return customerDao.findOne(id);
	}

	@Override
	public Customer insertOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		customerDao.delete(id);;
	}


}
