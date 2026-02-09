package edu.j2ee.product_service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import edu.j2ee.product_service.dto.ProductDto;
import edu.j2ee.product_service.entity.Product;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductMapper {
	private final ModelMapper modelMapper;

	public ProductDto toDto(Product product) {
		return modelMapper.map(product, ProductDto.class);
	}

	public Product toEntity(ProductDto productDto) {
		return modelMapper.map(productDto, Product.class);
	}
}
