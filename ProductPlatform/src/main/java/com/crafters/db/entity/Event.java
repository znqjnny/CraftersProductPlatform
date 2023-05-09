package com.crafters.db.entity;


import io.micronaut.core.annotation.NonNull;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Event {

    @BsonCreator
    public Event(@BsonId ObjectId id,
                 @BsonProperty("name") String name,
                 @BsonProperty("description") String description,
                 @BsonProperty("launchAt") LocalDateTime launchAt,
                 @BsonProperty("createdAt") LocalDateTime createdAt,
                 @BsonProperty("updatedAt") LocalDateTime updatedAt,
                 @BsonProperty("actor") Actor actor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.launchAt = launchAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.actor = actor;
    }

    public Event() { }



    @NonNull
    @NotBlank
    @BsonId
    private ObjectId id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("description")
    private String description;
    @BsonProperty("launchAt")
    private LocalDateTime launchAt;
    @BsonProperty("createdAt")
    private LocalDateTime createdAt;
    @BsonProperty("updateAt")
    private LocalDateTime updatedAt;
    @BsonProperty("actor")
    private Actor actor;


    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getLaunchAt() {
        return launchAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Actor getActor() {
        return actor;
    }

    //withName
    public Event withName(String name) {
        this.name = name;
        return this;
    }

    //withId
    public Event withId(ObjectId id) {
        this.id = id;
        return this;
    }

    //withDescription
    public Event withDescription(String description) {
        this.description = description;
        return this;
    }

    //withLaunchAt
    public Event withLaunchAt(LocalDateTime launchAt) {
        this.launchAt = launchAt;
        return this;
    }

    //withActor
    public Event withActor(Actor actor) {
        this.actor = actor;
        return this;
    }

    //withCreatedAt
    public Event withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    //withUpdatedAt
    public Event withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }


}
