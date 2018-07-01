package com.cp.springbootrabbit.mq.simple;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendHello {

    @Autowired
    private AmqpTemplate template;

    public void send(){
        template.convertAndSend("fevS","hello");
    }

}
