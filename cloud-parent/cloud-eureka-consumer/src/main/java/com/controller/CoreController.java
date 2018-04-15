package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tyhong on 2018/4/14.
 */
@RestController
@RequestMapping("consumer")
public class CoreController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("getOthers")
    public String getOthers(){//基础版;注解也只能用基础版的
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/inner/cc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("getOthersByRibbon")
    public String getOthersByRibbon(){//ribbon版
        /*ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/inner/cc";
        System.out.println(url);*/
        //这个是采用服务名的方式
        //因为Spring Cloud Ribbon有一个拦截器，它能够在这里进行实际调用的时候，自动的去选取服务实例，
        // 并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。
        return restTemplate.getForObject("http://eureka-client/inner/cc", String.class);
    }

}
