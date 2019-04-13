package com.huang.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //登录校验
        //获取zuul获取Zuul提供的请求上下文对象
        RequestContext rct = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest req = rct.getRequest();
        //从请求中获取token
        String token = req.getParameter("access-token");
        //判断
        if(token == null || "".equals(token.trim())){
            rct.setSendZuulResponse(false);
            rct.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
        }
        return null;
    }
}
