package com.crafters.db.repo;

import com.crafters.db.config.MongoDbProductConfiguration;
import com.crafters.db.entity.Product;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbProductRepository implements ProductRepository {
    private final MongoDbProductConfiguration mongoConf;
    private final MongoClient mongoClient;
    public MongoDbProductRepository(MongoDbProductConfiguration mongoConf,
                                    MongoClient mongoClient) {
        this.mongoConf = mongoConf;
        this.mongoClient = mongoClient;
    }


    @Override
    public void save(Product product) {
        getCollection().insertOne(product);
    }

    @Override
    @NonNull
    public List<Product> list() {
        return getCollection().find().into(new ArrayList<>());
    }

    @NonNull
    private MongoCollection<Product> getCollection() {
        return mongoClient.getDatabase(mongoConf.getName())
                .getCollection(mongoConf.getCollection(), Product.class);
    }
}
