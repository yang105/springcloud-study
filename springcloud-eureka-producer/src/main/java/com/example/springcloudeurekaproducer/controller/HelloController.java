package com.example.springcloudeurekaproducer.controller;

import com.example.springcloudeurekaproducer.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Random;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloController
 * Author:       zyang
 * Date:         2020/4/26 16:00
 * Description:  首页Controllr层
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/hello/")
    public String hello(@RequestParam String name) {
        int i = new Random().nextInt(3000);
        try {
            System.out.println(new Date() + "线程睡眠时间："+ i);
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, 这是" + name + "" + new Date();
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public Book hello1(@RequestHeader String name, @RequestHeader String author, @RequestHeader Integer price) throws UnsupportedEncodingException {
        Book book = new Book();
        book.setName(URLDecoder.decode(name,"UTF-8"));
        book.setAuthor(URLDecoder.decode(author,"UTF-8"));
        book.setPrice(price);
        logger.info(book.toString());
        return book;
    }
    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public String hello2(@RequestBody Book book) {
        return "书名为： " + book.getName() + ";作者为：" + book.getAuthor();
    }



}
