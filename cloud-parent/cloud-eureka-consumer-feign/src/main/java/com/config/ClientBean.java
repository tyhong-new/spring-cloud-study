package com.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tyhong on 2018/4/15.
 */
@FeignClient("eureka-client")
public interface ClientBean {
    @RequestMapping("inner/cc")
    String getGood();
}
