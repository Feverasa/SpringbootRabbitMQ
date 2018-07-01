/*
package com.cp.springbootrabbit.mq.workmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue2")
public class WorkReceiver {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("Receiver msg A" + msg);
    }

}
*/
