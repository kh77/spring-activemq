package com.sm.producer;

import com.sm.consumer.JmsConsumer;
import com.sm.model.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


@Component
public class JmsProducer {

    private static final Logger log = LoggerFactory.getLogger(JmsProducer.class);

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue employeeQueue;

    public void sendMessage(Employee message){
        try{
            jmsTemplate.convertAndSend(employeeQueue, message);
        } catch(Exception e){
            log.error("Received Exception during send Message: ", e);
        }
    }
}