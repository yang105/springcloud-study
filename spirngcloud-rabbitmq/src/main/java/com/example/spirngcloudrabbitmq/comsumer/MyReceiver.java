package com.example.spirngcloudrabbitmq.comsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     MyReceiver
 * Author:       zyang
 * Date:         2020/5/7 11:03
 * Description:  消费者
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@Component
public class MyReceiver {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 接收并打印消息
     * 可以当队列不存在时自动创建队列
     * @param message
     */
    @RabbitListener(queuesToDeclare =@Queue("myQueue"))
    public void process(String message) {
        //@RabbitListener注解用于监听RabbitMQ,queuesToDeclare可以创建指定的队列
        logger.info(message);
    }
}
