package com.ajt.hm.connection;

public enum DBType {
	ORACLE("ORACLE", "Oracle"), POSTGRESQL("POSTGRESQL", "PostgreSQL"), MYSQL("MYSQL", "MySQL");

	public String dbId;
	public String desc;

	DBType(String dbId, String desc) {
		this.dbId = dbId;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public String getDbId() {
		return dbId;
	}
}
