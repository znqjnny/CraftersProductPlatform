package com.crafters.db.repo;

import com.crafters.db.config.MongoDbPaymentConfiguration;
import com.crafters.db.entity.Payment;
import com.mongodb.client.MongoCollection;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class MongoDbPaymentRepository extends MongoDbRepository<Payment>{
    @Inject
    MongoDbPaymentConfiguration mongoConfig;

    @Override
    public void save(Payment payment) {
        getCollection(mongoConfig, Payment.class).insertOne(payment);
    }

    @Override
    @NonNull
    public List<Payment> list() {
        MongoCollection<Payment> collection = getCollection(mongoConfig, Payment.class);
        return collection.find().into(new ArrayList<>());
    }
}
