package net.pjsk.rabbitmq.common;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send1(String msg) {
        String context = msg + "-" + new Date();
        System.out.println("发送者1：" + context);
        rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }

    public void send2(String msg) {
        String context = msg + "-" + new Date();
        System.out.println("发送者2：" + context);
        rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
    }
}
