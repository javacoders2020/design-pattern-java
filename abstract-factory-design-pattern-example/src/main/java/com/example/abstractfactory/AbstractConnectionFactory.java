package com.example.abstractfactory;

import com.example.abstractfactory.database.DatabaseConnection;
import com.example.abstractfactory.messagebroker.MessageBrokerConnection;

//Abstract factory interface for creating different types of connections
public interface AbstractConnectionFactory {
	
	// Method to create a connection for message brokers, like Kafka or ActiveMQ
    MessageBrokerConnection createMessageBrokerConnection(String msgbrokerType);
    
    // Method to create a connection for databases, like Oracle, MySQL, or PostgreSQL
     DatabaseConnection createDatabaseConnection(String dbType);

}
