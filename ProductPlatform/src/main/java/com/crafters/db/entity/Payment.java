package com.crafters.db.entity;


import io.micronaut.core.annotation.NonNull;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Payment {
    
    @BsonCreator
    public Payment(@BsonId ObjectId id,
                   @BsonProperty("type") String type,
                   @BsonProperty("amount") double amount,
                   @BsonProperty("createdAt") LocalDateTime createdAt) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.createdAt = createdAt;
    }
    public Payment() { }
    
    @BsonId
    @NonNull
    @NotBlank
    @BsonProperty("_id")
    private ObjectId  id;
    @BsonProperty("type")
    private String type;
    @BsonProperty("amount")
    private double amount;
    @BsonProperty("createdAt")
    private LocalDateTime createdAt;

    public ObjectId getId() {
        return id;
    }

    public Payment withId(ObjectId  id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Payment withType(String type) {
        this.type = type;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Payment withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Payment withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
