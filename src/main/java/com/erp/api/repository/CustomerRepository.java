package com.erp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.api.models.CustomerEntity;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
		