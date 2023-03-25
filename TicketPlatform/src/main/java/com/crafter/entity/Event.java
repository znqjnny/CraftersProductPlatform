package com.crafter.entity;

import io.micronaut.data.annotation.MappedEntity;

import java.time.LocalDateTime;
@MappedEntity
public class Event {
    private String id;
    private String name;
    private LocalDateTime launchAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Actor actor;
}
