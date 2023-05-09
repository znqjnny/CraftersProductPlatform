package com.crafters.db.repo;

import com.crafters.db.config.MongoDbEventConfiguration;
import com.crafters.db.entity.Event;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbEventRepository extends MongoDbRepository<Event>{
    @Inject
    MongoDbEventConfiguration mongoConfig;

    @Override
    public void save(Event event) {
        getCollection(mongoConfig, Event.class).insertOne(event);
    }

    @Override
    @NonNull
    public List<Event> list() {
        MongoCollection<Event> collection = getCollection(mongoConfig, Event.class);
        return collection.find().into(new ArrayList<>());
    }
}
