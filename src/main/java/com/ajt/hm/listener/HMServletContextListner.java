package com.ajt.hm.listener;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ajt.hm.config.DBConfig;
import com.ajt.hm.factory.ConnectionFactory;
import com.ajt.hm.util.JsonParser;

public class HMServletContextListner implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("****** Application is getting live *******");
		DBConfig config = JsonParser.toType(DBConfig.class, new File("src/main/resources/dbconfig.json"));
		ConnectionFactory.factory().buildConnection(config);
		
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
	
}
