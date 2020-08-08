package com.cydvv.cydmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cydvv.cydmall.coupon.openapi")
@EnableDiscoveryClient
@SpringBootApplication
public class CydmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydmallCouponApplication.class, args);
    }

}
