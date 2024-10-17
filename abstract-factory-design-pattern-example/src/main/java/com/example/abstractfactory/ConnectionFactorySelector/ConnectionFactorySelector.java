package com.example.abstractfactory.ConnectionFactorySelector;

import com.example.abstractfactory.AbstractConnectionFactory;
import com.example.abstractfactory.database.factory.impl.DBConnectionFactoryImpl;
import com.example.abstractfactory.messagebroker.factory.impl.MessageBrokerConnectionFactoryImpl;

public class ConnectionFactorySelector {
	
	
	   // Static method to return the appropriate factory based on the type of connection needed
       public static AbstractConnectionFactory getFactory(String factoryType) {
       
      // Check if the requested factory is for database connections	
	  if (factoryType.equalsIgnoreCase("database")) {
            return new DBConnectionFactoryImpl(); // Return the factory for creating database connections
        } 
    	
    	
    	else if (factoryType.equalsIgnoreCase("messagebroker")) {
            return new MessageBrokerConnectionFactoryImpl(); // Return the factory for creating message broker connections
        }
        
	   // If the factory type is unknown, throw an exception
    	throw new IllegalArgumentException("Unknown factory type: " + factoryType);
    }
}