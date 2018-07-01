package com.cp.springbootrabbit.mq.workmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkSend {
    @Value("queue2")
    private String queueName;

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendMsg(int i){
        System.out.println("Send msg A");
        amqpTemplate.convertAndSend("queue2","Send msg " + i);
    }

}
