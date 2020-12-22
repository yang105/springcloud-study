package com.example.eurekaproducerfeign.controller;

import com.example.eurekaproducerfeign.entity.Book;
import com.example.eurekaproducerfeign.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloController
 * Author:       zyang
 * Date:         2020/4/26 17:06
 * Description:  helloController层
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;
    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }

    @RequestMapping(value = "/hello1")
    public Book hello1 () throws UnsupportedEncodingException {
        Book book = helloRemote.hello(URLEncoder.encode("三国演义","UTF-8"),URLEncoder.encode("罗贯中","UTF-8"),33);
        return book;
    }
    @RequestMapping(value = "/hello2")
    public String hello2() {
        Book book = new Book();
        book.setName("红楼梦");
        book.setAuthor("曹雪芹");
        book.setPrice(44);
        return helloRemote.hello(book);
    }
}
