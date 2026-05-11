package edu.j2ee.order_service.service;

import org.springframework.stereotype.Service;

import edu.j2ee.order_service.entity.Order;
import edu.j2ee.order_service.inter_service_communication.ProductClient;
import edu.j2ee.order_service.inter_service_communication.ProductResponseDto;
import edu.j2ee.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	private final OrderRepository orderRepository;
	private final ProductClient productClient;

	public Order placeOrder(Long productId, int quantity) {

		// Fetching product details from Product Service through Feign Client
		ProductResponseDto product = productClient.getProductById(productId);

		if (product.getStock() < quantity) {
			throw new RuntimeException("Insufficient stock");
		}

		Order order = new Order();
		order.setProductId(productId);
		order.setQuantity(quantity);
		order.setTotalPrice(product.getPrice() * quantity);

		return orderRepository.save(order);
	}
}
