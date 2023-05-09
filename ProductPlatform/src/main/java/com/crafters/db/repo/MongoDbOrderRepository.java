package com.crafters.db.repo;

import com.crafters.db.config.MongoDbOrderConfiguration;
import com.crafters.db.entity.Order;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbOrderRepository extends MongoDbRepository<Order>{
    @Inject
    MongoDbOrderConfiguration mongoConfig;

    @Override
    public void save(Order order) {
        getCollection(mongoConfig, Order.class).insertOne(order);
    }

    @Override
    @NonNull
    public List<Order> list() {
        MongoCollection<Order> collection = getCollection(mongoConfig, Order.class);
        return collection.find().into(new ArrayList<>());
    }
}
