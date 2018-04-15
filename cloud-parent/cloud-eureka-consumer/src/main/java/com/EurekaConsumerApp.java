package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tyhong on 2018/4/14.
 */
//@EnableEurekaClient//这个是基础版的
@EnableDiscoveryClient//这个是ribbon版的
@SpringBootApplication
public class EurekaConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApp.class);
    }

    @Bean
    @LoadBalanced//加了这个表示引入了ribbon
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
