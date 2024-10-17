package com.example.abstractfactory.ClientApplication;

import com.example.abstractfactory.AbstractConnectionFactory;
import com.example.abstractfactory.ConnectionFactorySelector.ConnectionFactorySelector;
import com.example.abstractfactory.database.DatabaseConnection;
import com.example.abstractfactory.messagebroker.MessageBrokerConnection;

public class ClientApplicationMain {
	
	 public static void main(String[] args) {
	       
	        // Get Database Connection Factory
	        // Using the Abstract Factory design pattern to retrieve the factory for database connections
		    AbstractConnectionFactory dbFactory = ConnectionFactorySelector.getFactory("database");
	        
		    // Create a connection for the Oracle database using the factory
		    DatabaseConnection dbConnection = dbFactory.createDatabaseConnection("oracle");
	        
		    // Establish a connection to the Oracle database
		    dbConnection.connect();  // Output: Connecting to Oracle...

		    // Get Message Broker Connection Factory
	        // Retrieve the factory for message broker connections using the selector
	        AbstractConnectionFactory brokerFactory = ConnectionFactorySelector.getFactory("messagebroker");
	        
	        // Create a connection for Kafka message broker using the factory
	        MessageBrokerConnection brokerConnection = brokerFactory.createMessageBrokerConnection("kafka");
	        
	        // Establish a connection to the Kafka message broker
	          brokerConnection.connect();  // Output: Connecting to Kafka...
	    }

}
