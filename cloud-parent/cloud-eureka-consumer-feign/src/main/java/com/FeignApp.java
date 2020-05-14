package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by tyhong on 2018/4/15.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class);
    }
}
