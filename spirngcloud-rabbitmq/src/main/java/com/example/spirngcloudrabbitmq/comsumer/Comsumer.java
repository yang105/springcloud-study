package com.example.spirngcloudrabbitmq.comsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     Comsumer
 * Author:       zyang
 * Date:         2020/5/6 17:24
 * Description:  消费者
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@Component
@RabbitListener(queues = "hello")
public class Comsumer {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RabbitHandler
    public void process(String msg) {
        logger.info("Receiver:" + msg);
    }

}
