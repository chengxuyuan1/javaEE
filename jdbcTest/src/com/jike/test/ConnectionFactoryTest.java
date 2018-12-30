package com.jike.test;

import java.sql.Connection;

import com.jike.util.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) throws Exception{
		ConnectionFactory connectionFactory=ConnectionFactory.getInstance();
		Connection connection=connectionFactory.makeConnection();
		System.out.println(connection.getAutoCommit());
	}
}
