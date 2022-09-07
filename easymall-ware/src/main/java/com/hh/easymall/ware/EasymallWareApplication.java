package com.hh.easymall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasymallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallWareApplication.class, args);
    }

}
