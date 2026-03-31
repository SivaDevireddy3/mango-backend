package com.siva.mango.service;

import com.siva.mango.entity.Order;
import com.siva.mango.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setStatus("PENDING");
        return orderRepository.save(order);
    }
}
