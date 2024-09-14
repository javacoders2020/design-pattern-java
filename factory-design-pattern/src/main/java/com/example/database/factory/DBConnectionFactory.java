package com.example.database.factory;

import com.example.database.DatabaseConnection;

//Factory interface for creating database connections for different database types.

public interface DBConnectionFactory {
 DatabaseConnection createConnection(String dbType);
}

