package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db.product")
public interface MongoDbProductConfiguration extends MongoDbConfiguration {}