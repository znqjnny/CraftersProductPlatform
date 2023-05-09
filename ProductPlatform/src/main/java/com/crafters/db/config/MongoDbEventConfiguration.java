package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;


@ConfigurationProperties("db.event")
public interface MongoDbEventConfiguration extends MongoDbConfiguration {}
