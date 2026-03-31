package com.siva.mango.service;

import com.siva.mango.entity.CartItem;
import com.siva.mango.repository.CartItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartItemRepository cartItemRepository;

    public CartItem addToCart(CartItem item) {
        return cartItemRepository.save(item);
    }
}
