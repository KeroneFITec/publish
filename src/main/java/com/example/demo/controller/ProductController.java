
package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return Arrays.asList(new Product(1, "Laptop"), new Product(2, "Phone"));
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return new Product(id, "Product" + id);
    }
}
