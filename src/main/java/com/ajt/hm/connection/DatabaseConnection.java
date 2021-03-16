package com.ajt.hm.connection;

import java.sql.Connection;

public interface DatabaseConnection {

	public Connection openConnection() throws Exception;

	public void closeConnection() throws Exception;

}
