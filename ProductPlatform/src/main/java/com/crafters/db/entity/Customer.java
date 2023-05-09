package com.crafters.db.entity;


import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;


public class Customer {
    @BsonCreator
    public Customer(@BsonId ObjectId id,
                    @BsonProperty("firstName") String firstName,
                    @BsonProperty("lastName") String lastName,
                    @BsonProperty("email") String email,
                    @BsonProperty("phone") String phone,
                    @BsonProperty("zipCode") String zipCode,
                    @BsonProperty("birthDate") LocalDateTime birthDate,
                    @BsonProperty("createdAt") String createdAt,
                    @BsonProperty("updatedAt") String updatedAt,
                    @BsonProperty("gender") String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.gender = gender;
    }

    public Customer() {
    }

    @BsonId
    private ObjectId id;
    @BsonProperty("firstName")
    private String firstName;
    @BsonProperty("lastName")
    private String lastName;
    @BsonProperty("email")
    private String email;
    @BsonProperty("phone")
    private String phone;
    @BsonProperty("zipCode")
    private String zipCode;
    @BsonProperty("birthDate")
    private LocalDateTime birthDate;
    @BsonProperty("createdAt")
    private String createdAt;
    @BsonProperty("updatedAt")
    private String updatedAt;
    @BsonProperty("gender")
    private String gender;

    public ObjectId getId() {
        return id;
    }

    public Customer withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Customer withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public Customer withBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Customer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Customer withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Customer withGender(String gender) {
        this.gender = gender;
        return this;
    }
}
