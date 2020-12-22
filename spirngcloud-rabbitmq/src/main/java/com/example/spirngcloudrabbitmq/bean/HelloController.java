package com.example.spirngcloudrabbitmq.bean;

import com.example.spirngcloudrabbitmq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     HelloController
 * Author:       zyang
 * Date:         2020/5/6 18:08
 * Description:
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@RestController
public class HelloController {
    @Autowired
    private Producer producer;
   @RequestMapping(value = "/hello")
    public void send() {
        producer.send();
    }

    @RequestMapping(value = "/send")
    public void mySend() {
        producer.myProducer();
    }


}
