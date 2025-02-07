package com.example.ms.product.controller;

import com.example.ms.product.entity.Product;
import com.example.ms.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> findByCategoryId(@RequestParam Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
