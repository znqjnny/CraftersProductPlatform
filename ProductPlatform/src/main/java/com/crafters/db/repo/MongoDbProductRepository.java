package com.crafters.db.repo;

import com.crafters.db.config.MongoDbProductConfiguration;
import com.crafters.db.entity.Product;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbProductRepository implements ProductRepository {
    private final MongoDbProductConfiguration mongoConf;
    private final MongoClient mongoClient;
    private final MongoDatabase mongoDatabase;
    public MongoDbProductRepository(MongoDbProductConfiguration mongoConf,
                                    MongoClient mongoClient) {
        this.mongoConf = mongoConf;
        this.mongoClient = mongoClient;
        mongoDatabase = mongoClient.getDatabase(mongoConf.getName());
    }


    @Override
    public void save(Product product) {
        getCollection().insertOne(product);
    }

    @Override
    @NonNull
    public List<Product> list() {
        MongoCollection<Product> collection = getCollection();
        return collection.find().into(new ArrayList<>());
    }


    @NonNull
    private MongoCollection<Product> getCollection() {
        return mongoDatabase.getCollection(mongoConf.getCollection(), Product.class);
    }
}
