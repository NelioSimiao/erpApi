package com.erp.api.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.erp.api.models.enums.ERole;
import com.erp.api.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserEntityTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private UserRepository userRepository;

	UserEntity user= new UserEntity();

	RoleEntity role = new RoleEntity();

	@Before
	public void setUp() {
		Set<RoleEntity> roles = new HashSet<>();

		role.setName(ERole.ROLE_ADMIN);
		roles.add(role);
		this.user.setId(10L);
		this.user.setUsername("nmuchisse");
		this.user.setEmail("nelio@gmail.com");
		this.user.setPassword("teste");
		this.user.setRoles(roles);

	}

	@Test
	public void runTeste() {
		
		entityManager.persist(user);


		entityManager.persist(role);
		
		//entityManager.flush();

		 UserEntity userEntity =userRepository.findByUsername(user.getUsername()).get();
		 
		 Set<RoleEntity> roles = userEntity.getRoles();
		 
		 assertThat(userEntity.getEmail()).isEqualTo(user.getEmail());

	}

}
