package com.example.eurekaproducerfeign.hystrix;

import com.example.eurekaproducerfeign.entity.Book;
import com.example.eurekaproducerfeign.feign.HelloRemote;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloRemoteHystrix
 * Author:       zyang
 * Date:         2020/4/26 17:55
 * Description:  hello接口熔断器
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World111111!"+new Date();
    }

    @Override
    public Book hello(@RequestHeader("name") String name, @RequestHeader("author") String author, @RequestHeader("price") Integer price) {
        return null;
    }


    @Override
    public String hello(@SpringQueryMap Book book) {
        return "Hello World!";
    }
}
