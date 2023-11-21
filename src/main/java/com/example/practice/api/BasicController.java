package com.example.practice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basic")
public class BasicController {

    @GetMapping(path = "/")
    public String getBasic(){
        return "Basic Api Controller Get";
    }
}
