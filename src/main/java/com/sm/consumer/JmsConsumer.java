package com.sm.consumer;

import com.sm.constant.QueueConstant;
import com.sm.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    private static final Logger log = LoggerFactory.getLogger(JmsConsumer.class);

    @JmsListener(destination = QueueConstant.EMPLOYEE_QUEUE,containerFactory = "jmsFactory")
    public void receiveEmployee(Employee employee) {
        try{
            //do additional processing
            log.info("Received Message: "+ employee.toString());
        } catch(Exception e) {
            log.error("Received Exception : "+ e);
        }
    }
}
