package com.rabbit.rmqproducer.model;

import lombok.Data;

@Data
public class MessageRequestModel {
    private String message;
    private String routingKey;
}
