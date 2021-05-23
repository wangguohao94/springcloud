package com.wgh.springcloud.springproviderconsulpayment8006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringProviderconsulPayment8006Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringProviderconsulPayment8006Application.class, args);
    }

}
