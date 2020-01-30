package com.joseluisestevez.msa.commons.products.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

	@Getter(AccessLevel.NONE)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	private Double price;

	private Date createAt;
	@JsonIgnore
	private Integer port;

}
