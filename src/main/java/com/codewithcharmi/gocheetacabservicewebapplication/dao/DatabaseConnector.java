package com.codewithcharmi.gocheetacabservicewebapplication.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnector {
	
	// --> Provide java sql connection type object
	public Connection getConnection() throws ClassNotFoundException, SQLException;

}
