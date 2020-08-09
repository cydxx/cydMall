package com.cydvv.cydmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CydmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydmallProductApplication.class, args);
    }

}
