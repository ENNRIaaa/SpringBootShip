package net.pjsk.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {

    private static final String message = "topic.message";
    private static final String messages = "topic.messages";

    @Bean
    public Queue messageQueue() {
        return new Queue(message);
    }

    @Bean
    public Queue messagesQueue() {
        return new Queue(messages);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue messageQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(messageQueue).to(topicExchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue messagesQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(messagesQueue).to(topicExchange).with("topic.#");
    }
}
