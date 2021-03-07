package com.mbugajski.springdemo.crm.service;

import java.util.List;

import com.mbugajski.springdemo.crm.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
