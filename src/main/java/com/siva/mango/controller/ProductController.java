package com.siva.mango.controller;

import com.siva.mango.entity.Product;
import com.siva.mango.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public Product add(@RequestBody Product p) {
        return service.addProduct(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }
}
