package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db.order")
public interface MongoDbOrderConfiguration extends MongoDbConfiguration {}
