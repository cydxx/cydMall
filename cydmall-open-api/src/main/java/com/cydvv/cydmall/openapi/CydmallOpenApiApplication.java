package com.cydvv.cydmall.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CydmallOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydmallOpenApiApplication.class, args);
    }

}
