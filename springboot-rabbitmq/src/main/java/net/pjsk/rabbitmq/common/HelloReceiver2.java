package net.pjsk.rabbitmq.common;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者2：" + message);
    }
}
