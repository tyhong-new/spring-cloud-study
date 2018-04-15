package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tyhong on 2018/4/14.
 */
@RestController
@RequestMapping("inner")
public class FirstController {
    @RequestMapping("cc")
    public String getGood(){
        return "good";
    }
}
