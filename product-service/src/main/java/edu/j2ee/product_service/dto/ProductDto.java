package edu.j2ee.product_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
	private String name;
	private double price;
	private int stock;
}
