package com.azure.spring.cloud.example.customers.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> { }
