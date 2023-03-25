package com.crafter.entity;

import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public class Actor {
    private String id;
    private String name;
    private String email;
}
