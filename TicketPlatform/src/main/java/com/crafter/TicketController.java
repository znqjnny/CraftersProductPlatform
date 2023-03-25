package com.crafter;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;

@Controller
public class TicketController {

    /**
     * This is the main entry point for the application
     * @return
     */
        @Get("/ticket")
        public String index() {
            return "Hello World";
        }

}
