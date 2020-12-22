package com.example.springcloudstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     MySink
 * Author:       zyang
 * Date:         2020/5/12 15:04
 * Description:  自定义Sink接口
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

public interface MySink {
    String INPUT = "mychannel";
    @Input(INPUT)
    SubscribableChannel input();
}
