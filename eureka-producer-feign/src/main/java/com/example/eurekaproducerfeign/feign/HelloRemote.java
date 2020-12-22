package com.example.eurekaproducerfeign.feign;

import com.example.eurekaproducerfeign.entity.Book;
import com.example.eurekaproducerfeign.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloRemote
 * Author:       zyang
 * Date:         2020/4/26 16:49
 * Description:  feign服务调用接口
 * History:
 * <author>      <time>        d  <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@FeignClient(name = "eureka-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

    @GetMapping(value = "/hello1")
    Book hello(@RequestHeader("name") String name, @RequestHeader("author") String author, @RequestHeader("price") Integer price);

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    String hello(@RequestBody Book book);
}
