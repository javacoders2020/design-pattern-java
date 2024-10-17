package com.example.abstractfactory.messagebroker.factory.impl;


import com.example.abstractfactory.AbstractConnectionFactory;
import com.example.abstractfactory.database.DatabaseConnection;
import com.example.abstractfactory.messagebroker.MessageBrokerConnection;
import com.example.abstractfactory.messagebroker.impl.ActiveMQConnection;
import com.example.abstractfactory.messagebroker.impl.KafkaConnection;

//Concrete factory implementation for creating message broker connections
public class MessageBrokerConnectionFactoryImpl implements AbstractConnectionFactory {

	// Method to create message broker connections based on the broker type
	public MessageBrokerConnection createMessageBrokerConnection(String msgbrokerType) {
	
		// Switch-case to determine which message broker connection to create
		switch (msgbrokerType.toLowerCase()) {
         
		case "kafka":
             return new KafkaConnection();
         
         case "activemq":
             return new ActiveMQConnection();
          
          default:
             throw new IllegalArgumentException("Unsupported message broker type  " + msgbrokerType);
     }
		
	}


   public DatabaseConnection createDatabaseConnection(String dbType) {
	
	   // Throw an exception as this factory only handles message broker connections
	      throw new UnsupportedOperationException("This factory does not create  database connections.");
	}

}
