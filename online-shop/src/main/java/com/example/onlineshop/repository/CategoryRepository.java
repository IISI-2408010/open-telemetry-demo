package com.example.onlineshop.repository;

import com.example.onlineshop.entity.Category;
import io.opentelemetry.instrumentation.annotations.WithSpan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {

    @WithSpan
    public List<Category> findAll() {
        return List.of(
                new Category(1L, "Electronics", "Electronic devices"),
                new Category(2L, "Clothing", "Clothing items"),
                new Category(3L, "Books", "Books")
        );
    }

    @WithSpan
    public Category findById(Long id) {
        return findAll().stream()
                .filter(row -> row.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
