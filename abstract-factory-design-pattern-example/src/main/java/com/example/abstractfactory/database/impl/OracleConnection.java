package com.example.abstractfactory.database.impl;

import com.example.abstractfactory.database.DatabaseConnection;

//Specific implementation for Oracle
public class OracleConnection  implements DatabaseConnection {

  public void connect() {
      System.out.println("Connecting to Oracle database...");
  }
	
	
}
