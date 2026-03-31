package com.siva.mango.controller;

import com.siva.mango.entity.CartItem;
import com.siva.mango.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CartController {

    private final CartService service;

    @PostMapping
    public CartItem add(@RequestBody CartItem item) {
        return service.addToCart(item);
    }
}
