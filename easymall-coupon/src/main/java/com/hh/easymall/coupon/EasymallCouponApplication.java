package com.hh.easymall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasymallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallCouponApplication.class, args);
    }

}
