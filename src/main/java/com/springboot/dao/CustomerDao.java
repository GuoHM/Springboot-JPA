package com.springboot.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, String> {

}
