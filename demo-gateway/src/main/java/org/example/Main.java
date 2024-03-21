package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableWebFluxSecurity
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}