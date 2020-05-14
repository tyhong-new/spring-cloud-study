package com.controller;

import com.service.Isss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tyhong on 2018/4/14.
 */
@RestController
@RequestMapping("inner")
public class FirstController {
    @Autowired
    private Isss sss;
    @RequestMapping("cc")
    public String getGood(){
        //sss.ccc("bbb");
        //sss.bbb("bbb");
        System.out.println(sss.getClass());
        sss.ddd("ddd");
        return "good";
    }
}
