package com.mbugajski.springdemo.crm.dao;

import java.util.List;

import com.mbugajski.springdemo.crm.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

}
