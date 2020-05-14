package com.controller;

import com.config.ClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tyhong on 2018/4/15.
 */
@RequestMapping("a")
@RestController
public class FeignController {
    @Autowired
    private ClientBean clientBean;

    @RequestMapping("good")
    public String getClientGood(){
        return clientBean.getGood();
    }
}
