package com.example.springcloudstream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     MySource
 * Author:       zyang
 * Date:         2020/5/12 15:06
 * Description:  自定义Source接口
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

public interface MySource {
    @Output(MySink.INPUT)
    MessageChannel output();
}
