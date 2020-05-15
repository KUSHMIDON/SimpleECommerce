package com.example.SimpleECommerce.service;

import com.example.SimpleECommerce.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();
    Product getProduct(long id);
    Product save(Product product);
}
