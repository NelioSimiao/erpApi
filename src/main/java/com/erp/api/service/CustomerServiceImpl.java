package com.erp.api.service;

import org.springframework.stereotype.Service;

import com.erp.api.models.CustomerEntity;
import com.erp.api.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository cuustomerRepository;

	@Override
	public CustomerEntity create(CustomerEntity customerEntity) {
		return cuustomerRepository.save(customerEntity);
	}

}
