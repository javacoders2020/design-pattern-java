package com.example.database.impl;

import com.example.database.DatabaseConnection;

//Specific implementation for Oracle
public class OracleConnection  implements DatabaseConnection {

    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
	
	
}
