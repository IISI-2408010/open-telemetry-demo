package com.example.onlineshop.repository;

import com.example.onlineshop.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
@AllArgsConstructor
public class ProductRepository {

    private final RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    public List<Product> findByCategoryId(Long categoryId) {
        return restTemplate.getForObject("http://localhost:8081/products?categoryId=" + categoryId, List.class);
    }
}
