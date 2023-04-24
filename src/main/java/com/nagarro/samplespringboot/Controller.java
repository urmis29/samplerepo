package com.nagarro.samplespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Controller {

        // One syntax to implement a
        // GET method
        @GetMapping("/")
        public String simple()
        {
            String str ="WELCOME To Simple App";
            return str;
        }
    }


