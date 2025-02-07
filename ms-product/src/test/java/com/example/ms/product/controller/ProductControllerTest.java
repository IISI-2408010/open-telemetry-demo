package com.example.ms.product.controller;

import com.example.ms.product.entity.Product;
import com.example.ms.product.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductControllerTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findByCategoryId_returnsProductsForExistingCategory() {
        List<Product> products = List.of(
                new Product(1L, "Product 1", "Description 1", 100.0, 1L),
                new Product(2L, "Product 2", "Description 2", 200.0, 1L),
                new Product(3L, "Product 3", "Description 3", 300.0, 2L),
                new Product(4L, "Product 4", "Description 4", 400.0, 2L),
                new Product(5L, "Product 5", "Description 5", 500.0, 3L),
                new Product(6L, "Product 6", "Description 6", 600.0, 3L)
        );
        when(productRepository.findByCategoryId(1L)).thenReturn(products);

        List<Product> result = productController.findByCategoryId(1L);

        assertEquals(6, result.size());
        assertEquals("Product 1", result.get(0).getName());
        assertEquals("Product 2", result.get(1).getName());
    }

    @Test
    void findByCategoryId_returnsEmptyListForNonExistingCategory() {
        when(productRepository.findByCategoryId(99L)).thenReturn(Collections.emptyList());

        List<Product> result = productController.findByCategoryId(99L);

        assertEquals(0, result.size());
    }

    @Test
    void findByCategoryId_returnsEmptyListForNullCategoryId() {
        when(productRepository.findByCategoryId(null)).thenReturn(Collections.emptyList());

        List<Product> result = productController.findByCategoryId(null);

        assertEquals(0, result.size());
    }
}