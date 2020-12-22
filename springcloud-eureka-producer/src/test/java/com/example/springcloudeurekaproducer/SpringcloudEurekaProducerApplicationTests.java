package com.example.springcloudeurekaproducer;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudEurekaProducerApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SpringcloudEurekaProducerApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("打印info日志");
    }


}
