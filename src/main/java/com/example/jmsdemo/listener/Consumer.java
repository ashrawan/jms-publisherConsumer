package com.example.jmsdemo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(containerFactory = "jmsListenerContainerFactory", destination="myTopic")
    public void firstConsumer(String message) {
        System.out.println("Received Message 1: " + message);
    }

    @JmsListener(containerFactory = "jmsListenerContainerFactory", destination="myTopic")
    public void secondConsumer(String message) {
        System.out.println("Received Message 2: " + message);
    }

    @JmsListener(containerFactory = "jmsListenerContainerFactory", destination="myTopic")
    public void thirdConsumer(String message) {
        System.out.println("Received Message 3: " + message);
    }
}