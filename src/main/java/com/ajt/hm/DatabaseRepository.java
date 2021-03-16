package com.ajt.hm;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.ajt.hm.factory.ConnectionFactory;

public abstract class DatabaseRepository {

	private boolean nonSelect(String sql) throws SQLException, Exception {
		Statement st = ConnectionFactory.factory().getConnection().createStatement();
		boolean flag = st.executeUpdate(sql) == 1;
		st.close();
		ConnectionFactory.factory().closeConnection();
		return flag;
	}

	public boolean save(String sql) throws SQLException, Exception {
		if (Objects.nonNull(sql) && sql.toUpperCase().startsWith("INSERT")) {
			return nonSelect(sql);
		}
		return false;
	}

	public boolean update(String sql) throws SQLException, Exception {
		if (Objects.nonNull(sql) && sql.toUpperCase().startsWith("UPDATE")) {
			return nonSelect(sql);
		}
		return false;
	}

	public boolean delete(String sql) throws SQLException, Exception {
		if (Objects.nonNull(sql) && sql.toUpperCase().startsWith("DELETE")) {
			return nonSelect(sql);
		}
		return false;
	}

	public List<Map<String, Object>> select(String sql) throws SQLException, Exception {
		Statement st = ConnectionFactory.factory().getConnection().createStatement();
		ResultSet resultSet = st.executeQuery(sql);
		ResultSetMetaData metaData = resultSet.getMetaData();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		while (resultSet.next()) {
			HashMap<String, Object> map = new HashMap<>();
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				map.put(metaData.getColumnLabel(i), resultSet.getObject(i));
			}
			list.add(map);
		}
		resultSet.close();
		st.close();
		ConnectionFactory.factory().closeConnection();
		return list;
	}

}
