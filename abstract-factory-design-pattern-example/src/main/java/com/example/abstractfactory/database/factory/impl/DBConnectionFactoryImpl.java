package com.example.abstractfactory.database.factory.impl;

import com.example.abstractfactory.AbstractConnectionFactory;
import com.example.abstractfactory.database.DatabaseConnection;
import com.example.abstractfactory.database.impl.MySQLConnection;
import com.example.abstractfactory.database.impl.OracleConnection;
import com.example.abstractfactory.database.impl.PostgreSQLConnection;
import com.example.abstractfactory.messagebroker.MessageBrokerConnection;

//Factory class implementation to create specific database connections using switch-case
public class DBConnectionFactoryImpl implements AbstractConnectionFactory  {

 // Method to create database connections based on the dbType passed
 public DatabaseConnection createDatabaseConnection(String dbType) {
     switch (dbType.toLowerCase()) {
         case "oracle":
             return new OracleConnection();
         case "postgresql":
             return new PostgreSQLConnection();
         case "mysql":
             return new MySQLConnection();
         default:
        	  // Throw an exception if the dbType does not match the supported databases
             throw new IllegalArgumentException("Unsupported database type: " + dbType);
     }
 }

//Method to create message broker connections - unsupported in this factory
public MessageBrokerConnection createMessageBrokerConnection(String msgbrokerType) {
	
    throw new UnsupportedOperationException("This factory does not create message broker connections.");

}




}
