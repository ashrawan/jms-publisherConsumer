package com.example.jmsdemo;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsdemoApplication.class, args);


    }
}
