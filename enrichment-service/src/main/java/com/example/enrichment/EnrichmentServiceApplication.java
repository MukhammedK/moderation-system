package com.example.enrichment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class EnrichmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrichmentServiceApplication.class, args);
    }

}
