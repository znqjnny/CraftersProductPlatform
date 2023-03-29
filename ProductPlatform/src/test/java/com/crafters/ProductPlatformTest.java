package com.crafters;

import com.crafters.db.entity.Product;
import com.crafters.db.repo.MongoDbProductRepository;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest(transactional = false)
class ProductPlatformTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }



    @Inject
    MongoDbProductRepository mongoDbProductRepository;



    @Test
    void testProduct() {
        mongoDbProductRepository.save(new Product("ticket").withInStock(100));
    }


}
