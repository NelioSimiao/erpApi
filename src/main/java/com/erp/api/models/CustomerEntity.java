package com.erp.api.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer")
public class CustomerEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Size(max = 120)
	private String name;

	@NotBlank
	@Size(max = 9)
	private String cellphone;

	@NotBlank
	@Size(max = 120)
	private String employer;

	@NotBlank
	@Size(max = 20)
	private String identificationDocument;

	@OneToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserEntity user;

}
