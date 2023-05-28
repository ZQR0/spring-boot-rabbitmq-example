package com.rabbit.rmqconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "queue-1")
    public void processQueue(String message) {
        log.info(String.format("[RabbitMQ Custom Log] Received from queue-1 : %s", new String(message.getBytes())));
    }
}
