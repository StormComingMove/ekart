package com.example.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ekart.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity,String> {

}
