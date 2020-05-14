package com.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by tyhong on 2018/4/15.
 */
public class SimpleFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        System.out.println(requestContext.getRequest().getRequestURI());
        HttpServletRequest request = requestContext.getRequest();
        String name = request.getParameter("user");
        if ("sb".equalsIgnoreCase(name)) {
            //这句表示不再往下执行了，也不会跳到相应的服务中
            requestContext.setSendZuulResponse(false);
            //这句表示返回错误码
            requestContext.setResponseStatusCode(401);
        }
        return null;
    }

}
