package com.joseluisestevez.msa.commons.users.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {

	private Long id;

	@NotNull
	private String name;

}
