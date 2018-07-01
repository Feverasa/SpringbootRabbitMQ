/*
package com.cp.springbootrabbit.mq.workmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkReceiver2 {


    @Value("queue_name")
    private String queueName;

    @RabbitListener(queues = "queue2")
    public void receiver2(String msg){
        System.out.println("Receiver msg B ................." + msg);
    }

}
*/
