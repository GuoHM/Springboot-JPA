package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.dao.CustomersDao;
import com.springboot.entity.Customers;
import com.springboot.service.CustomersService;

public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
    CustomersDao customersDao;

	@Override
	public List<Customers> findAll() {
		// TODO Auto-generated method stub
		return customersDao.findAll();
	}

}
