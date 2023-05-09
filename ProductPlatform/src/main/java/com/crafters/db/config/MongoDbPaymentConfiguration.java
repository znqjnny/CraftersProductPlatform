package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db.payment")
public interface MongoDbPaymentConfiguration extends MongoDbConfiguration {}
