package com.example.SimpleECommerce.controller;

import com.example.SimpleECommerce.model.Product;
import com.example.SimpleECommerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping(value = "/")
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
