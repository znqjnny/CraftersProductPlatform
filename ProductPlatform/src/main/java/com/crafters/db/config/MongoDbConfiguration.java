package com.crafters.db.config;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.naming.Named;

public interface MongoDbConfiguration extends Named {
    @NonNull
    String getCollection();
}
