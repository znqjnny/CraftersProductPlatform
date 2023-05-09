package com.crafters.db.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.naming.Named;


@ConfigurationProperties("db.actor")
public interface MongoDbActorConfiguration extends Named {
    @NonNull
    String getCollection();
}
