package com.example.springcloudeureka.listener;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2010-2020, 广州广电运通智能科技有限公司
 * FileName:     EurekaStateChangeListener
 * Author:       zyang
 * Date:         2020/4/26 10:56
 * Description:  Eureka事件监听器
 * History:
 * <author>      <time>          <version>          <desc>
 * 作者姓名       修改时间         版本号             描述
 */

@Component
public class EurekaStateChangeListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        logger.info(event.getServerId() +"\t"+ event.getAppName() + " 服务下线");
    }
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        logger.info(instanceInfo.getAppName() + "进行注册");
    }
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        logger.info(event.getServerId() +"\t" + event.getAppName() + "服务进行续约");
    }
    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        logger.info("注册中心 启动");
    }
    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        logger.info("Eureka Server 启动");
    }
}
