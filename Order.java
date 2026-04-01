package com.example.ecommerce.entity;
import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
}