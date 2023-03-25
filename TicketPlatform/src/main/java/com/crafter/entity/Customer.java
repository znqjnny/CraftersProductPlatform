package com.crafter.entity;

import io.micronaut.data.annotation.MappedEntity;

import java.time.LocalDateTime;

@MappedEntity
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String zipCode;
    private LocalDateTime birthDate;
    private String createdAt;
    private String updatedAt;
    private String gender;
}
