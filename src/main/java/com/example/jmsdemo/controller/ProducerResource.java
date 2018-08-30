package com.example.jmsdemo.controller;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ActiveMQTopic topic;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message) {
        System.out.println("Message will be published now: "+ message);
        jmsTemplate.convertAndSend(topic, message);
        return "Message published successfully";
    }
}