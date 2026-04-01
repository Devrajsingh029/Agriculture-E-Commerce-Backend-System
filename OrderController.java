package com.example.ecommerce.controller;
import com.example.ecommerce.entity.Order;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo){this.repo=repo;}

    @PostMapping public Order create(@RequestBody Order o){return repo.save(o);}
    @GetMapping public List<Order> all(){return repo.findAll();}
}