package com.ajt.hm.util;

import java.io.File;
import java.util.Objects;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

	private JsonParser() {
	}

	public static ObjectMapper defaultObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return mapper;
	}

	public static String toJson(Object object) {
		String json = null;
		try {
			if (Objects.nonNull(object)) {
				json = defaultObjectMapper().writeValueAsString(object);
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		return json;
	}

	public static <T> T toType(Class<T> t, String json) {
		try {
			return defaultObjectMapper().readValue(json, t);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		return null;
	}

	public static <T> T toType(Class<T> t, File file) {
		try {
			return defaultObjectMapper().readValue(file, t);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		return null;
	}

}
