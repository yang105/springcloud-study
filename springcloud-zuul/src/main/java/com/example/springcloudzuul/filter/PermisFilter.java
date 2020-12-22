package com.example.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     PermisFilter
 * Author:       zyang
 * Date:         2020/4/30 11:41
 * Description:  权限验证过滤器
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

public class PermisFilter extends ZuulFilter {
    /**
     * 过滤器的类型，它决定过滤器在请求的哪个生命周期中执行
     * 这里定义为pre，代表会在请求被路由之前调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter执行顺序，通过数字指定
     *数字越大，优先级越低
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断该过滤器是否需要被执行。这里直接返回true,因此该过滤器对所有请求都会生效
     * 实际运用中可以利用该函数来指定过滤器的有效范围
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String loginName = request.getParameter("loginName");
        if (loginName == null) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.addZuulResponseHeader("content-type","text/html;charset=utf-8");
            context.setResponseBody("非法访问");
        }
        return null;
    }
}
