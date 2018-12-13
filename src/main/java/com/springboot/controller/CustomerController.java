package com.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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
	
	@ModelAttribute
	public void setCustomer(Model model) {
		model.addAttribute("customer",new Customer());
	}

	@PostMapping("/ShowCustomers")
	public ModelAndView showCustomers() {
		ModelAndView mav = new ModelAndView("insert_customer");
		//mav.addObject("customer", new Customer());
		return mav;
	}

	@RequestMapping("/InsertCustomer")
	public String insertCustomers(Model model) {
		model.addAttribute("customer", new Customer());
		return "insert_customer";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping("/dba")
	public String dba() {
		return "dba";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public ModelAndView logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    ModelAndView mav = new ModelAndView("insert_customer");
	    mav.addObject("customer", new Customer());
	    return mav;//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}

	@PostMapping("/CustomerForm")
	public ModelAndView insertCustomers(@ModelAttribute Customer customer) {
		customerService.insertOrUpdate(customer);
		ModelAndView mav = new ModelAndView("insert_success");
		mav.addObject("customer", customer);
		mav.addObject("customer", new Customer());
		return mav;
	}

	@RequestMapping("/api/lsitCustomers")
	@ResponseBody
	public List<Customer> listCustomers() {
		return customerService.findAll();
	}
	//this is a test for guohaoming123
	//this is a test in github
	//test
	//本地修改
        //雲端修改

   //本地

        //云端改

}
