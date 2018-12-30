package com.jike.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory factory=new ConnectionFactory();
	
	private Connection connection;
	
	static {
		Properties properties=new Properties();
		try {
			InputStream inputStream=ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
			properties.load(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("========配置文件读取错误===============");
		}
		
		driver=properties.getProperty("driver");
		dburl=properties.getProperty("dburl");
		user=properties.getProperty("user");
		password=properties.getProperty("password");
	}
	
	private ConnectionFactory() {
		
	} 
	public static ConnectionFactory getInstance() {
		return factory;
	}
	public Connection makeConnection() {
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(dburl,user,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
}
