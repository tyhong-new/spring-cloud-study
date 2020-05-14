package com.service;

import com.a.anno;
import com.a.bbb;
import org.springframework.stereotype.Component;

/**
 * Created by tyhong on 2019/3/2.
 */
@Component
public class Sss implements Isss {
    @Override
    @anno
    public void ccc(String aaa) {
        System.out.println(this.getClass());
        System.out.println("aaa:"+aaa);
    }

    @Override
    @bbb
    public void bbb(String aaa) {
        System.out.println(this.getClass());
        System.out.println("bbb");
    }

    @Override
    @bbb
    public void ddd(String aaa) {
        System.out.println(this.getClass());
        System.out.println("ddd");
        bbb(aaa);
    }
}
