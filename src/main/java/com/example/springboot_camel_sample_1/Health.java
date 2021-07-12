package com.example.springboot_camel_sample_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/health")
    public String SayOK(){
        return "OK";
    }
}
