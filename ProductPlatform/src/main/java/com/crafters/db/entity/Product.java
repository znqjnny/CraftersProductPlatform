package com.crafters.db.entity;


import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Serdeable
public class Product {
    @Creator
    @BsonCreator
    public Product(@BsonId ObjectId id,
                   @BsonProperty("name") String name,
                   @BsonProperty("createAt") LocalDateTime createdAt,
                   @BsonProperty("updateAt") LocalDateTime updatedAt,
                   @BsonProperty("expiredAt") LocalDateTime expiredAt,
                   @BsonProperty("seat") String seat,
                   @BsonProperty("location") String location,
                   @BsonProperty("inStock") int inStock,
                   @BsonProperty("sold") int sold,
                   @BsonProperty("event") Event event,
                   @BsonProperty("type") String type) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expiredAt = expiredAt;
        this.seat = seat;
        this.location = location;
        this.inStock = inStock;
        this.sold = sold;
        this.event = event;
        this.type = type;
    }

    public Product() { }


    @BsonId
    private ObjectId id;


    @BsonProperty("name")
    private String name;
    @BsonProperty("createAt")
    private LocalDateTime createdAt;
    @BsonProperty("updateAt")
    private LocalDateTime updatedAt;
    @BsonProperty("expiredAt")
    private LocalDateTime expiredAt;
    @BsonProperty("seat")
    private String seat;
    @BsonProperty("location")
    private String location;
    @BsonProperty("inStock")
    private int inStock;
    @BsonProperty("sold")
    private int sold;
    @BsonProperty("event")
    private Event event;
    @BsonProperty("type")
    private String type;

    public ObjectId getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    //withName()
    public Product withName(String name) {
        this.name = name;
        return this;
    }

    // withId() and other fields as well
    public Product withId(ObjectId id) {
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
