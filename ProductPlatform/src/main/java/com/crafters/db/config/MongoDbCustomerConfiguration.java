package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db.customer")
public interface MongoDbCustomerConfiguration extends MongoDbConfiguration {}
