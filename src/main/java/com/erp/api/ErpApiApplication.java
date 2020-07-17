package com.erp.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.erp.api.models.RoleEntity;
import com.erp.api.models.UserEntity;
import com.erp.api.models.enums.ERole;
import com.erp.api.repository.RoleRepository;
import com.erp.api.repository.UserRepository;

@SpringBootApplication
public class ErpApiApplication {
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository UserRepository;
	
	
	@Autowired
	PasswordEncoder encoder;

	@PostConstruct
	public void insertRoles() {

		if (roleRepository.findAll().isEmpty()) {

			RoleEntity role = new RoleEntity();
			role.setName(ERole.ROLE_ADMIN);
			RoleEntity role2 = new RoleEntity();
			role2.setName(ERole.ROLE_USER);
			List<RoleEntity> roles = new ArrayList<RoleEntity>();
			roles.add(role);
			roles.add(role2);

			this.roleRepository.saveAll(roles);
		}
		
		
		if (UserRepository.findAll().isEmpty()) {

			UserEntity user= new UserEntity("nmuchisse","teste@teste.com",encoder.encode("teste"));
			UserRepository.saveAndFlush(user);
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(ErpApiApplication.class, args);
	}

}
