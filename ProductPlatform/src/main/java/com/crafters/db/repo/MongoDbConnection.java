package com.crafters.db.repo;

import com.crafters.db.config.MongoDbConfiguration;
import com.crafters.db.config.MongoDbProductConfiguration;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import io.micronaut.core.naming.Named;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class MongoDbConnection {
    @Inject
    MongoClient mongoClient;

    public MongoDatabase getMongoDatabase(MongoDbConfiguration mongoConf) {
        return mongoClient.getDatabase(mongoConf.getName());
    }
}
