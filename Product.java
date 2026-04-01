package com.example.ecommerce.entity;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public double getPrice(){return price;}
    public void setPrice(double p){this.price=p;}
}