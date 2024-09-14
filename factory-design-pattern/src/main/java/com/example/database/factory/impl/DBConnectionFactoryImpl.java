package com.example.database.factory.impl;

import com.example.database.DatabaseConnection;
import com.example.database.factory.DBConnectionFactory;
import com.example.database.impl.MySQLConnection;
import com.example.database.impl.OracleConnection;
import com.example.database.impl.PostgreSQLConnection;

// Factory class implementation with switch-case to create specific database connections
public class DBConnectionFactoryImpl implements DBConnectionFactory {

    
    public DatabaseConnection createConnection(String dbType) {
        switch (dbType.toLowerCase()) {
            case "oracle":
                return new OracleConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "mysql":
                return new MySQLConnection();
            default:
                throw new IllegalArgumentException("Unsupported database type: " + dbType);
        }
    }
}
