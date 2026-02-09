package edu.j2ee.product_service.service;

import org.springframework.stereotype.Service;

import edu.j2ee.product_service.dto.ProductDto;
import edu.j2ee.product_service.entity.Product;
import edu.j2ee.product_service.mapper.ProductMapper;
import edu.j2ee.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository repository;
	private final ProductMapper mapper;

	public Product getProductById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
	}

	public Product saveProduct(ProductDto product) {
		return repository.save(mapper.toEntity(product));
	}
}
