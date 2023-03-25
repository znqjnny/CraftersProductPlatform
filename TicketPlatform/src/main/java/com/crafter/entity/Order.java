package com.crafter.entity;

import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public class Order {
    private String id;
    private String name;
    private Payment payment;
    private String createdAt;
    private Customer customer;
    private Ticket ticket;

}
