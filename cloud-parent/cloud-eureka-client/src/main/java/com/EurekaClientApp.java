package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by tyhong on 2018/4/14.
 */
@EnableEurekaClient
//@EnableAspectJAutoProxy
@SpringBootApplication
public class EurekaClientApp {
    public static void main(String[] args) {
        //SpringApplication.run(EurekaClientApp.class);
        new SpringApplicationBuilder(
                EurekaClientApp.class)
                .web(true).run(args);

    }
}
