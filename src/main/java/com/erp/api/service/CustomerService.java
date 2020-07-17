package com.erp.api.service;

import org.springframework.stereotype.Service;

import com.erp.api.models.CustomerEntity;

public interface CustomerService {
	CustomerEntity create(CustomerEntity customerEntity );

}
