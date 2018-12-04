package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.dao.CustomersDao;
import com.springboot.entity.Customers;

@RestController
@RequestMapping(value = "/CustomersJPA")
public class CustomersController {
	
	@Autowired
    CustomersDao customersDao;
	
	@RequestMapping("/ShowCustomers")
    public ModelAndView  showCustomers() {
		ModelAndView mav = new ModelAndView("showcustomers");
		mav.addObject("customersList", customersDao.findAll());
        return mav;
    }

}
