package com.siva.mango.controller;

import com.siva.mango.entity.Order;
import com.siva.mango.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order place(@RequestBody Order order) {
        return service.placeOrder(order);
    }
}
