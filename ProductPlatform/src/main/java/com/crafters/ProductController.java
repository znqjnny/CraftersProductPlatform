package com.crafters;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;

import java.util.function.Function;
import java.util.stream.Stream;

@Controller
public class ProductController {

    /**
     * This is the main entry point for the application
     * @return
     */
        @Get("/product")
        public String index() {

            //create a Stream of "helloworld" and return it
                Stream.of("Hello World").map(String::length).map(integer -> integer.toString());
            return "Hello World";
        }

}
