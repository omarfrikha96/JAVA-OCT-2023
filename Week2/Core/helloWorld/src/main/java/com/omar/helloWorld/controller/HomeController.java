package com.omar.helloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
        @RequestMapping("/")
        public String hello() {
                return "Hello World!";
        }
        
        @RequestMapping("/home")
        public String home() {
                return "<h1> hellos</h1>";
        }
}
