package com.crafters.db.repo;

import com.crafters.db.config.MongoDbCustomerConfiguration;
import com.crafters.db.entity.Customer;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbCustomerRepository extends MongoDbRepository<Customer>{
    @Inject
    MongoDbCustomerConfiguration mongoConfig;

    @Override
    public void save(Customer customer) {
        getCollection(mongoConfig, Customer.class).insertOne(customer);
    }

    @Override
    @NonNull
    public List<Customer> list() {
        MongoCollection<Customer> collection = getCollection(mongoConfig, Customer.class);
        return collection.find().into(new ArrayList<>());
    }
}
