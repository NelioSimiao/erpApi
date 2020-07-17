package com.erp.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.api.models.CustomerEntity;
import com.erp.api.payload.request.LoginRequest;
import com.erp.api.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/customer/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/crete")
	public ResponseEntity<?> create(@Valid @RequestBody LoginRequest loginRequest) {

		 this.customerService.create(new CustomerEntity());

		return null;
	}

}
