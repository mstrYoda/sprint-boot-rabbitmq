package com.example.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "spring-boot")
    public void consume(MyEvent message) {
        System.out.println("Received <" + message.getMessage() + ">");
    }
}
