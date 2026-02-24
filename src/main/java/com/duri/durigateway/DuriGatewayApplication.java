package com.duri.durigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DuriGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuriGatewayApplication.class, args);
    }

}
