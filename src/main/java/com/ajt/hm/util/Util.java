package com.ajt.hm.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Objects;

import com.ajt.hm.factory.ConnectionFactory;

public class Util {

	private Util() {
	}

	public static Encoder encoder() {
		return Base64.getEncoder();
	}

	public static Decoder decoder() {
		return Base64.getDecoder();
	}

	public static String encodeString(String str) {
		if (Objects.nonNull(str) && !str.trim().isEmpty()) {
			return encoder().encodeToString(str.getBytes());
		}
		return  new String();
	}

	public static String decodeString(String str) {
		if (Objects.nonNull(str) && !str.trim().isEmpty()) {
			return new String(decoder().decode(str));
		}
		return new String();
	}

	public static boolean isTableExist(String table) {
		String sql = "SELECT COUNT(*) FROM information_schema.TABLES WHERE TABLE_SCHEMA='hospital_management' AND TABLE_NAME='"
				+ table + "'";
		try (Connection connection = ConnectionFactory.factory().getConnection();
				ResultSet rs = connection.createStatement().executeQuery(sql)) {
			rs.next();
			return rs.getInt(1) > 0;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			return false;
		}
	}

}
