package com.cydvv.cydmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CydmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydmallOrderApplication.class, args);
    }

}
