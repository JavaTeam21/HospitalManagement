package com.ajt.hm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

import com.ajt.hm.config.DBConfig;

public class OracleConnection implements DatabaseConnection {

	private DBConfig config;
	private Connection conn;

	public OracleConnection(DBConfig config) {
		this.config = config;
	}

	@Override
	public Connection openConnection() throws Exception {
		if (Objects.isNull(conn) || conn.isClosed()) {
			conn = DriverManager.getConnection(config.getUrl(), config.getUserName(), config.getPassword());
		}
		return conn;
	}

	@Override
	public void closeConnection() throws Exception {
		if (Objects.nonNull(conn) && !conn.isClosed()) {
			conn.close();
			conn = null;
		}

	}

}
