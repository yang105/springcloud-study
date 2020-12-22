package com.example.springcloudadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class SpringcloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAdminApplication.class, args);
    }

}
