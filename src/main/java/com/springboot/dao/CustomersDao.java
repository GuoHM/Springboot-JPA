package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Customers;

public interface CustomersDao extends JpaRepository<Customers, String> {

}
