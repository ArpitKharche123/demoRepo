package edu.j2ee.order_service;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	private final OrderService orderService;

	@PostMapping
	public ResponseEntity<Order> createOrder(@RequestParam Long productId, @RequestParam int quantity) {
		return ResponseEntity.status(HttpStatus.SC_CREATED).body(orderService.placeOrder(productId, quantity));
	}
}
