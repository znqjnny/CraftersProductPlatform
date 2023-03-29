package com.crafters.db.entity;


import java.time.LocalDateTime;

public class Event {
    private String id;
    private String name;
    private LocalDateTime launchAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Actor actor;
}
