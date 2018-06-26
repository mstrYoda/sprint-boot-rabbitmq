package com.example.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Publisher {
    @Autowired
    RabbitTemplate rabbitTemplate;

    public void publishTestEvent(){
        MyEvent x = new MyEvent();
        x.setMessage("test" + new Random().nextInt());

        rabbitTemplate.convertAndSend("spring-boot-exchange", "", x);
    }
}
