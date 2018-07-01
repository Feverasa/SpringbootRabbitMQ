package com.cp.springbootrabbit.mq.workmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkMQ2 {

    @Value("queue2")
    private String queueName;

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(int i){
        System.out.println("Send Msg B");
        amqpTemplate.convertAndSend(queueName,"Send msg " + i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
