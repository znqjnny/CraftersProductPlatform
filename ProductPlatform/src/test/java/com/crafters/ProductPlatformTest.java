package com.crafters;

import com.crafters.db.entity.Event;
import com.crafters.db.entity.Product;
import com.crafters.db.repo.MongoDbProductRepository;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import java.time.LocalDateTime;
import java.util.List;

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
        mongoDbProductRepository.save(new Product().withName("ticket1233").withInStock(23100)
                .withEvent(new Event().withName("eve1n1t0").withCreatedAt(LocalDateTime.now())));
    }

    @Test
    void testProductList() {
        List<Product> products = mongoDbProductRepository.list();
        products.forEach(a -> System.out.println(a.getName() + "\n" + a.getId()));
    }

}
