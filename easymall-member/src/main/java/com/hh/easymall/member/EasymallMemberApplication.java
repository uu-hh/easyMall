package com.hh.easymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hh.easymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class EasymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallMemberApplication.class, args);
    }

}
