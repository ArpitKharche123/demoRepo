package edu.j2ee.order_service.inter_service_communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductClient {
	@GetMapping("products/{id}")
	ProductResponseDto getProductById(@PathVariable Long id);
	// We use service name, not hardcoded URL
	//It will be dynamically discovered via Eureka.
}
