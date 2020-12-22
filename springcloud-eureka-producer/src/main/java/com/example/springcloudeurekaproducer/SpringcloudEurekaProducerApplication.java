package com.example.springcloudeurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaProducerApplication.class, args);
    }


}
