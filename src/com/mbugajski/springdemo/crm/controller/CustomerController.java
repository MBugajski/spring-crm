package com.mbugajski.springdemo.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mbugajski.springdemo.crm.dao.CustomerDAO;
import com.mbugajski.springdemo.crm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
				
		return "list-customers";
	}
	

}
