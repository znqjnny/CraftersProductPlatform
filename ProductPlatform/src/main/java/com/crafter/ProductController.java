package com.crafter;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;

@Controller
public class ProductController {

    /**
     * This is the main entry point for the application
     * @return
     */
        @Get("/product")
        public String index() {
            return "Hello World";
        }

}
