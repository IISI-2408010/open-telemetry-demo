package com.example.ms.product.repository;

import com.example.ms.product.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products;

    public ProductRepository() {
        products = List.of(
                new Product(1L, "Product 1", "Description 1", 100.0, 1L),
                new Product(2L, "Product 2", "Description 2", 200.0, 1L),
                new Product(3L, "Product 3", "Description 3", 300.0, 2L),
                new Product(4L, "Product 4", "Description 4", 400.0, 2L),
                new Product(5L, "Product 5", "Description 5", 500.0, 3L),
                new Product(6L, "Product 6", "Description 6", 600.0, 3L)
        );
    }

    public List<Product> findByCategoryId(Long categoryId) {
        return products.stream()
                .filter(product -> product.getCategoryId().equals(categoryId))
                .toList();
    }
}
