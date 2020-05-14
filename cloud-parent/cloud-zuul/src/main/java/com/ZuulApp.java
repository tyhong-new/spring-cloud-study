package com;

import com.Filter.SimpleFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by tyhong on 2018/4/15.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class);
    }
    @Bean
    public ZuulFilter simpleFilter(){
        return new SimpleFilter();
    }
}
