package com.erp.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.erp.api.models.enums.ERole;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class RoleEntity   extends BaseEntity{
	private static final long serialVersionUID = 1L;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;

}
