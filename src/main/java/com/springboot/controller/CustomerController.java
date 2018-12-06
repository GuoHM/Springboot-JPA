package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@Controller
@RequestMapping(value = "/CustomersJPA")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/ShowCustomers")
	public ModelAndView showCustomers() {
		ModelAndView mav = new ModelAndView("show_customers");
		mav.addObject("customersList", customerService.findAll());
		return mav;
	}
	
	@RequestMapping("/InsertCustomer")
	public String insertCustomers(Model model) {
		model.addAttribute("customer", new Customer());
		return "insert_customer";
	}
	
	@PostMapping("/CustomerForm")
	public ModelAndView insertCustomers(@ModelAttribute Customer customer) {
		customerService.insertOrUpdate(customer);
		ModelAndView mav = new ModelAndView("insert_success");
		mav.addObject("customer", customer);
		return mav;
	}
	
	@RequestMapping("/api/lsitCustomers")
	@ResponseBody
	public List<Customer> listCustomers() {
		List<Customer> result = new ArrayList<Customer>();
		result.add(customerService.findById("ABC"));
		return result;
	}
	

}
