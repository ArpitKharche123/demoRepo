package edu.j2ee.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.j2ee.order_service.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
