package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("db.actor")
public interface MongoDbActorConfiguration extends MongoDbConfiguration {}
