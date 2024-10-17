package com.example.abstractfactory.database.impl;

import com.example.abstractfactory.database.DatabaseConnection;

//Specific implementation for MySQL
public class MySQLConnection implements DatabaseConnection {

public void connect() {
   System.out.println("Connecting to MySQL database...");
}

}
