package com.crafters.db.repo;

import com.crafters.db.config.MongoDbActorConfiguration;
import com.crafters.db.entity.Actor;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbActorRepository extends MongoDbRepository<Actor>{
    @Inject
    MongoDbActorConfiguration mongoConfig;

    @Override
    public void save(Actor actor) {
        getCollection(mongoConfig, Actor.class).insertOne(actor);
    }

    @Override
    @NonNull
    public List<Actor> list() {
        MongoCollection<Actor> collection = getCollection(mongoConfig, Actor.class);
        return collection.find().into(new ArrayList<>());
    }
}
