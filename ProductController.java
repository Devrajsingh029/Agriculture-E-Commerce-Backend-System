package com.example.ecommerce.controller;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo){this.repo=repo;}

    @PostMapping public Product add(@RequestBody Product p){return repo.save(p);}
    @GetMapping public List<Product> all(){return repo.findAll();}
}