package com.each.kittyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.each.*")
public class KittyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KittyBootApplication.class, args);
    }

}

