package com.crafters.db.entity;


import io.micronaut.core.annotation.NonNull;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Order {
    @BsonCreator
    public Order(@BsonId ObjectId id,
                 @BsonProperty("name") String name,
                 @BsonProperty("payment") Payment payment,
                 @BsonProperty("createdAt") LocalDateTime createdAt,
                 @BsonProperty("customer") Customer customer,
                 @BsonProperty("product") Product product) {
        this.id = id;
        this.name = name;
        this.payment = payment;
        this.customer = customer;
        this.product = product;
        this.createdAt = createdAt;
    }


    @BsonId
    @NonNull
    @NotBlank
    @BsonProperty("_id")
    private ObjectId id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("description")
    private Payment payment;
    @BsonProperty("createdAt")
    private LocalDateTime createdAt;
    @BsonProperty("customer")
    private Customer customer;
    @BsonProperty("product")
    private Product product;

    public ObjectId getId() {
        return id;
    }

    public Order withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Order withName(String name) {
        this.name = name;
        return this;
    }

    public Payment getPayment() {
        return payment;
    }

    public Order withPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Order withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Order withProduct(Product product) {
        this.product = product;
        return this;
    }
}
