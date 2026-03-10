package com.countries.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class WelcomeController {

        @GetMapping("/")
        public String welcome() {
            return "Malthe er en lille flødebolle dreng, og tim han godt lide moyonaise på hans mad " +
                    "εつ▄█▀█●";
        }
    }
