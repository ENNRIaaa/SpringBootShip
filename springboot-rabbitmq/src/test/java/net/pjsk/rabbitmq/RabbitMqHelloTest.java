package net.pjsk.rabbitmq;

import net.pjsk.rabbitmq.common.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void test() {
        helloSender.send2("消息1");
    }
}
