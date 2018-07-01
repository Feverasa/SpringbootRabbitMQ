package com.cp.springbootrabbit.mq.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConf {

    @Value("queue_name")
    private String queue2;

    @Bean
    public Queue queue(){
        return new Queue("fevS");
    }

    @Bean
    public Queue queue2(){
        return new Queue(queue2);
    }



}
