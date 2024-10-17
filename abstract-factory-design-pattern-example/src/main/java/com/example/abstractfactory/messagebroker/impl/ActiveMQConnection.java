package com.example.abstractfactory.messagebroker.impl;

import com.example.abstractfactory.messagebroker.MessageBrokerConnection;

//Specific implementation for ActiveMQConnection
public class ActiveMQConnection implements MessageBrokerConnection {

    public void connect() {
        System.out.println("Connecting to ActiveMQ...");
    }
}