package edu.j2ee.order_service.inter_service_communication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
	private Long id;
	private String name;
	private double price;
	private int stock;
}
