package com.example.ms.product.repository;

import com.example.ms.product.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    void findByCategoryId_returnsProductsForExistingCategory() {
        List<Product> products = productRepository.findByCategoryId(1L);
        assertEquals(2, products.size());
        assertTrue(products.stream().allMatch(product -> product.getCategoryId().equals(1L)));
    }

    @Test
    void findByCategoryId_returnsEmptyListForNonExistingCategory() {
        List<Product> products = productRepository.findByCategoryId(99L);
        assertTrue(products.isEmpty());
    }

    @Test
    void findByCategoryId_returnsEmptyListForNullCategoryId() {
        List<Product> products = productRepository.findByCategoryId(null);
        assertTrue(products.isEmpty());
    }
}