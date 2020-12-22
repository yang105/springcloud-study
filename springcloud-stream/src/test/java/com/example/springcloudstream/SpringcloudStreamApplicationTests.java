package com.example.springcloudstream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MySource.class)
@SpringBootTest
class SpringcloudStreamApplicationTests {
   @Autowired
    private MySource mySource;
    @Test
    void contextLoads() {
        mySource.output().send(MessageBuilder.withPayload("hello123").build());
    }

}
