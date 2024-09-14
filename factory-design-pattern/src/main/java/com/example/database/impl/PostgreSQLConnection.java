package com.example.database.impl;

import com.example.database.DatabaseConnection;

//Specific implementation for PostgreSQL
public class PostgreSQLConnection implements DatabaseConnection {
 
 public void connect() {
     System.out.println("Connecting to PostgreSQL database...");
 }

}