package com.example.abstractfactory.messagebroker.impl;

import com.example.abstractfactory.messagebroker.MessageBrokerConnection;

//Specific implementation for Kafka
public class KafkaConnection implements MessageBrokerConnection {
  
    public void connect() {
        System.out.println("Connecting to Kafka...");
    }

}