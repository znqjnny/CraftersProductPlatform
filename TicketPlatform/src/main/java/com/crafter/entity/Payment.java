package com.crafter.entity;

import io.micronaut.data.annotation.MappedEntity;

import java.time.LocalDateTime;
@MappedEntity
public class Payment {
    private String id;
    private String type;
    private double Amount;
    private LocalDateTime createdAt;
}
