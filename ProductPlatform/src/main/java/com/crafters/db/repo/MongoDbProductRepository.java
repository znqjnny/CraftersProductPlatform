package com.crafters.db.repo;

import com.crafters.db.config.MongoDbProductConfiguration;
import com.crafters.db.entity.Product;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbProductRepository extends MongoDbRepository<Product>{
    @Inject
    MongoDbProductConfiguration mongoConfig;

    @Override
    public void save(Product product) {
        getCollection(mongoConfig, Product.class).insertOne(product);
    }

    @Override
    @NonNull
    public List<Product> list() {
        MongoCollection<Product> collection = getCollection(mongoConfig, Product.class);
        return collection.find().into(new ArrayList<>());
    }
}
