package com.example.SimpleECommerce.repository;

import com.example.SimpleECommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
