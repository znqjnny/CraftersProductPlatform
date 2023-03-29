package com.crafters.db.entity;


import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Serdeable
public class Product {
    @Creator
    @BsonCreator
    public Product(@NonNull @BsonProperty("name") String name) {
        this.name = name;
    }
    @NonNull
    @NotBlank
    @BsonProperty("_id")
    private String id;

    public String getId() {
        return id;
    }

    @NonNull
    @NotBlank
    @BsonProperty("name")
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime expiredAt;
    private String seat;
    private String location;
    @BsonProperty("inStock")
    private int inStock;
    private int sold;
    private Event event;

    //withName()
    public Product withName(String name) {
        this.name = name;
        return this;
    }

    // withId() and other fields as well
    public Product withId(String id) {
        this.id = id;
        return this;
    }

    public Product withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Product withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Product withExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    public Product withSeat(String seat) {
        this.seat = seat;
        return this;
    }

    public Product withLocation(String location) {
        this.location = location;
        return this;
    }

    public Product withInStock(int inStock) {
        this.inStock = inStock;
        return this;
    }

    public Product withSold(int sold) {
        this.sold = sold;
        return this;
    }

    public Product withEvent(Event event) {
        this.event = event;
        return this;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public String getSeat() {
        return seat;
    }

    public String getLocation() {
        return location;
    }

    public int getInStock() {
        return inStock;
    }

    public int getSold() {
        return sold;
    }

    public Event getEvent() {
        return event;
    }
}
