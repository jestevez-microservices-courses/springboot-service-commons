package com.joseluisestevez.msa.commons.users.dto;

import java.util.Set;

import javax.management.relation.Role;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	private Long id;

	@NotNull
	private String username;
	@NotNull
	private String password;
	@NotNull
	private Boolean enabled;

	private String firstname;

	private String lastname;
	@NotNull
	private String email;

	private Set<Role> roles;

	private Integer attempts;

}
