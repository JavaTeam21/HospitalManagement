package com.ajt.hm.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class RestResourceConfig extends ResourceConfig {
	public RestResourceConfig() {
		packages("com.ajt.hm.rest");
	}
}
