# JMS-Publish/Subscribe Demo Application
* Spring Boot
* Apache ActiveMQ

### JMS
Java message service enables logically coupled communication between two or more systems.

##### JMS has several implementations..
[Apache ActiveMQ](http://activemq.apache.org/activemq-5150-release.html)


#### There are two types of messaging models in JMS.
1. Point-to-Point Messaging Domain
2. Publish/Subscribe Messaging Domain

##### With Spring boot
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-activemq</artifactId>
</dependency>
```

+ ActiveMQConnectionFactory
+ DefaultJmsListenerContainerFactory
+ JmsTemplate
+ ActiveMQTopic
+ @JmsListener

### Deployment
Go to: Apache ActiveMQ Extracted folder / bin <br/>
`cmd` -> activemq start

+ Run Spring boot application
