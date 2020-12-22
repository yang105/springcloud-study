package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloController
 * Author:       zyang
 * Date:         2020/4/27 16:40
 * Description:  访问Controller
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${neo.hello:error}")
    private String profile;

    @Value("${foo}")
    private String foo;

    @GetMapping("/info")
    public Mono<String> Hello() {
        return Mono.justOrEmpty(profile);
    }
    @RequestMapping("/hello")
    public String from() {
        return this.foo;
    }

}
