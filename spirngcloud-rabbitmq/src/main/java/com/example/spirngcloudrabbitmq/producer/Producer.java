package com.example.spirngcloudrabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     Producer
 * Author:       zyang
 * Date:         2020/5/6 17:12
 * Description:  生产者
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@Component
public class Producer {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String msg = "hello rabbitmq:" +new Date();
        logger.info("Producer:"+msg);
        this.amqpTemplate.convertAndSend("hello",msg);
    }
    public void myProducer() {
        for ( int i = 0; i <100; i++) {
            amqpTemplate.convertAndSend("myQueue","第" + i + "条消息");
        }
    }
}
