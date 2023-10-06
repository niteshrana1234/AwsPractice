package com.example.awspractice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/message/{name}")
public String message(@PathVariable String name){

    return "Hello "+name;
}

}
