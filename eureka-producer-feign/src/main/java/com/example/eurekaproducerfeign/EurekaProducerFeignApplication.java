package com.example.eurekaproducerfeign;


import feign.Logger;
import feign.Retryer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaProducerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerFeignApplication.class, args);
    }
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }

}
