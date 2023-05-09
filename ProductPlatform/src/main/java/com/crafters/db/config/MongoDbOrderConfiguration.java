package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.naming.Named;

@ConfigurationProperties("db.order")
public interface MongoDbOrderConfiguration extends Named {
    @NonNull
    String getCollection();
}
