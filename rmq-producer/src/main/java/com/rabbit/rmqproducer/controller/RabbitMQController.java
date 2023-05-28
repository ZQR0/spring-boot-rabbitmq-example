package com.rabbit.rmqproducer.controller;

import com.rabbit.rmqproducer.model.MessageRequestModel;
import com.rabbit.rmqproducer.service.RabbitMQProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RabbitMQController {

    private final RabbitMQProducerService service;

    @GetMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageRequestModel model) {
        this.service.sendMessage(model.getMessage(), model.getRoutingKey());
    }

    @GetMapping("/health")
    public String getHealth() {
        return "OK";
    }
}
