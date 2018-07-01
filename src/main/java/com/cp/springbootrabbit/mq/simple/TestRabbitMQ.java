package com.cp.springbootrabbit.mq.simple;

import com.cp.springbootrabbit.SpringbootrabbitApplication;
import com.cp.springbootrabbit.mq.ack.AckSender;
import com.cp.springbootrabbit.mq.workmq.WorkMQ2;
import com.cp.springbootrabbit.mq.workmq.WorkSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SpringbootrabbitApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {

    @Autowired
    private SendHello sendHello;
    @Autowired
    private WorkMQ2 workSend;
//    @Autowired
//    private ReceiverHello receiverHello;
    @Autowired
    private AckSender ackSender;

    @Test
    public void testRabbit(){
        sendHello.send();
    }

    @Test
    public void test2(){
        for (int i =0;i<20;i++){
            workSend.sendMsg(i);
        }
    }

    @Test
    public void test3(){
        ackSender.send("topic.he","ack Msg!!!");
    }

    /*@Test
    public void test2(){
        receiverHello.process();
    }*/

}
