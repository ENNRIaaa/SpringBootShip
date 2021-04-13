package net.pjsk.rabbitmq.common;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class HelloReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者1：" + message);
    }
}
