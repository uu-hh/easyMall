package com.hh.easymall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasymallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallOrderApplication.class, args);
    }

}
