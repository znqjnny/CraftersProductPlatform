package com.crafters;

import com.crafters.db.entity.*;
import com.crafters.db.repo.*;
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
    @Inject
    MongoDbPaymentRepository mongoDbPaymentRepository;
    @Inject
    MongoDbEventRepository mongoDbEventRepository;
    @Inject
    MongoDbActorRepository mongoDbActorRepository;
    @Inject
    MongoDbCustomerRepository mongoDbCustomerRepository;
    @Inject
    MongoDbOrderRepository mongoDbOrderRepository;


    @Test
    void testAddProduct() {
        mongoDbProductRepository.save(new Product().withName("ticket1233").withInStock(23100)
                .withEvent(new Event().withName("eve1n1t0").withCreatedAt(LocalDateTime.now())));
    }

    @Test
    void testProductList() {
        List<Product> products = mongoDbProductRepository.list();
        products.forEach(
                a -> System.out.println("Product id:" + a.getId() + "\t" + "Product name: " + a.getName() + "\t" +
                        "Product in stock: " + a.getInStock() + "\t" + "Product event: " + a.getEvent().getName() +
                        "\t"));
    }

    @Test
    void testAddActor() {
        mongoDbActorRepository.save(new Actor().withName("actor1").withEmail("bnakjsj@gnauk.com"));
    }

    @Test
    void testActorList() {
        mongoDbActorRepository.list()
                .forEach(a -> System.out.println(
                        "actor id: " + a.getId() + "\t" + "actor name: " + a.getName() + "\t" + "actor email: " +
                                a.getEmail()));
    }

    @Test
    void testAddEvent() {
        mongoDbEventRepository.save(new Event().withName("event1").withCreatedAt(LocalDateTime.now()));
    }

    @Test
    void testEventList() {
        mongoDbEventRepository.list()
                .forEach(a -> System.out.println(
                        "event id: " + a.getId() + "\t" + "event name: " + a.getName() + "\t" + "event created at: " +
                                a.getCreatedAt()));
    }

    @Test
    void testAddCustomer() {
        mongoDbCustomerRepository.save(new Customer().withFirstName("customer1").withEmail("cusotnmkm@gmail.com"));
    }

    @Test
    void testCustomerList() {
        mongoDbCustomerRepository.list()
                .forEach(a -> System.out.println(
                        "customer id: " + a.getId() + "\t" + "customer name: " + a.getFirstName() + "\t" +
                                "customer email: " +
                                a.getEmail()));
    }

    @Test
    void testAddOrder() {
        mongoDbOrderRepository.save(new Order()
                .withCustomer(new Customer().withFirstName("customer1").withEmail("cuslknalkdn@gmail.com"))
                .withProduct(new Product().withName("ticket1233").withInStock(23100)
                        .withEvent(new Event().withName("eve1n1t0").withCreatedAt(LocalDateTime.now()))));
    }

    @Test
    void testOrderList() {
        mongoDbOrderRepository.list()
                .forEach(a -> System.out.println(
                        "order id: " + a.getId() + "\t" + "order customer: " + a.getCustomer().getFirstName() + "\t" +
                                "order product: " +
                                a.getProduct().getName()));
    }

    @Test
    void testAddPayment() {
        mongoDbPaymentRepository.save(new Payment().withAmount(1000));

    }

    @Test
    void testPaymentList() {
        mongoDbPaymentRepository.list()
                .forEach(a -> System.out.println(
                        "payment id: " + a.getId() + "\t" + "payment amount: " + a.getAmount()));
    }
}
