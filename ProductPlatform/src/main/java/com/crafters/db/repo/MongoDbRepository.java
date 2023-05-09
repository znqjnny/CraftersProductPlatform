package com.crafters.db.repo;


import com.crafters.db.config.MongoDbConfiguration;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;

import java.util.List;

public abstract class MongoDbRepository<T> {
    private MongoDatabase mongoDatabase;
    @Inject
    MongoDbConnection mongoDbConnection;

    private MongoDatabase getMongoDatabase(MongoDbConfiguration mongoConfig) {
        if(mongoDatabase == null) {
            mongoDatabase = mongoDbConnection.getMongoDatabase(mongoConfig);
        }
        return mongoDatabase;
    }

    @NonNull
    protected MongoCollection<T> getCollection(MongoDbConfiguration mongoConfig, Class clazz){
        return getMongoDatabase(mongoConfig).getCollection(mongoConfig.getCollection(), clazz);
    }

    public abstract List<T> list();

    public abstract void save(T t);


}
