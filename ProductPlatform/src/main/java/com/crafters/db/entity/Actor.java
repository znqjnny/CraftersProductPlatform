package com.crafters.db.entity;


import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Actor {

    @BsonCreator
    public Actor(@BsonId ObjectId id,
                 @BsonProperty("name") String name,
                 @BsonProperty("email") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Actor() {}

    @BsonId
    private ObjectId  id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("email")
    private String email;

    public ObjectId  getId() {
        return id;
    }

    public Actor withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Actor withName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Actor withEmail(String email) {
        this.email = email;
        return this;
    }
}
