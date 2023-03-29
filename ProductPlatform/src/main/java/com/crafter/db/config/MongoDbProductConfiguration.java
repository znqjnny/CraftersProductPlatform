package com.crafter.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.naming.Named;

@ConfigurationProperties("db.product")
public interface MongoDbProductConfiguration extends Named {

    @NonNull
    String getCollection();
}