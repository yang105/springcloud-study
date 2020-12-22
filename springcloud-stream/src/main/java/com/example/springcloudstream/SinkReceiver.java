package com.example.springcloudstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     SinkReceiver
 * Author:       zyang
 * Date:         2020/5/12 14:22
 * Description:  接收mq消息
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        logger.info("Received:" + playload);
    }
}
