package com.example.springcloudstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     SinkReceiver2
 * Author:       zyang
 * Date:         2020/5/12 15:09
 * Description:  自定义消息接收类
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */
@EnableBinding(value = {MySink.class})
public class SinkReceiver2 {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver2.class);
    @StreamListener(MySink.INPUT)
    public void receiver(Object playload) {
        logger.info("Received:" + playload);
    }
}
