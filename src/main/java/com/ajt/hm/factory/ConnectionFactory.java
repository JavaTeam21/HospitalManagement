package com.ajt.hm.factory;

import java.sql.Connection;

import com.ajt.hm.config.DBConfig;
import com.ajt.hm.connection.DBType;
import com.ajt.hm.connection.DatabaseConnection;
import com.ajt.hm.connection.MySQLConnection;
import com.ajt.hm.connection.OracleConnection;

public class ConnectionFactory {
	private static ConnectionFactory factory = new ConnectionFactory();
	private DatabaseConnection databaseConnection;

	private ConnectionFactory() {
		//DBConfig config = JsonParser.toType(DBConfig.class, new File("src/main/resources/dbconfig.json"));
		//buildConnection(config);
	}

	public static ConnectionFactory factory() {
		return factory;
	}

	public void buildConnection(DBConfig config) {
		System.out.println("######## Building Database Connection ########");
		if (DBType.MYSQL.getDesc().equalsIgnoreCase(config.getVendor())) {
			databaseConnection = new MySQLConnection(config);
		} else if (DBType.POSTGRESQL.getDesc().equalsIgnoreCase(config.getVendor())) {

		} else if (DBType.ORACLE.getDesc().equalsIgnoreCase(config.getVendor())) {
			databaseConnection = new OracleConnection(config);
		} else {

		}
		System.out.println("Driver Class Name : " + config.getDriverClass());
		System.out.println("Url : " + config.getUrl());
		System.out.println("Username : " + config.getUserName());
		System.out.println("Password : " + config.getPassword());
		System.out.println("Vendor : " + config.getVendor());
		System.out.println("##########################################################");

	}

	public Connection getConnection() throws Exception {
		return databaseConnection.openConnection();
	}

	public void closeConnection() throws Exception {
		databaseConnection.closeConnection();
	}

	public void dispose() throws Exception {
		closeConnection();
		databaseConnection = null;
	}
	
}
