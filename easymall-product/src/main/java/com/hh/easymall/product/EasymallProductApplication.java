package com.hh.easymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.hh.easymall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class EasymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallProductApplication.class, args);
    }

}
