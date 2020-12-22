package com.example.spirngcloudrabbitmq;

import com.example.spirngcloudrabbitmq.producer.Producer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpirngcloudRabbitmqApplicationTests {
    @Autowired
    private Producer producer;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    void contextLoads() {
        producer.send();
    }
    @Test
    public void send() {
        for ( int i = 0; i <100; i++) {
            amqpTemplate.convertAndSend("myQueue","第" + i + "条消息");
        }
    }

}
