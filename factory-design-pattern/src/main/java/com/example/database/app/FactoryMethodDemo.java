package com.example.database.app;

import com.example.database.DatabaseConnection;
import com.example.database.factory.DBConnectionFactory;
import com.example.database.factory.impl.DBConnectionFactoryImpl;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        
    	// Create a factory instance using the DBConnectionFactory implementation
    	DBConnectionFactory factory = new DBConnectionFactoryImpl();

        // Use the factory method to create an Oracle database connection
        DatabaseConnection connection = factory.createConnection("oracle");
        
        // Connect to the Oracle database using the connection obtained from the factory method
        connection.connect(); // Output: Connecting to Oracle database...

        // Use the factory method to create an postgresql database connection
        connection = factory.createConnection("postgresql");
        
        // Connect to the postgresql database using the connection obtained from the factory method
        connection.connect(); // Output: Connecting to PostgreSQL database...

        //  Connect to the MySQL database using the connection obtained from the factory method
        connection = factory.createConnection("mysql");
        
     // Connect to the MySQL database using the connection obtained from the factory method
        connection.connect(); // Output: Connecting to MySQL database...
    
    
    }
}
