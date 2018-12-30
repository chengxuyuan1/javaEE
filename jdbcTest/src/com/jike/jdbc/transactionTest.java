package com.jike.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionTest {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsp_db?useUnicode=true&characterEncoding=utf8&useSSL=false", "root",
					"hg@564900");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

	public static void insertUserData(Connection connection) throws SQLException {

		String sql = "INSERT INTO tbl_user(id,name,password,email)" + "VALUES(10,'Tom','123456','tom@gmail.com')";
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate(sql);
		System.out.println("向用户表中插入了" + count + " 条记录");
		connection.close();

	}

	public static void insertAddressData(Connection connection) throws SQLException {
			String sql = "INSERt INTO tbl_adress(id,city,country,user_id)" + "VALUES(1,'shanghai','china',10)";
			Statement statement = connection.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向地址表中插入" + count + "条记录");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
			connection=getConnection();
			connection.setAutoCommit(false);
			
			insertUserData(connection);
		insertAddressData(connection);
			
		connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("======捕获到SQL异常======");
			e.printStackTrace();
			
			try {
				connection.rollback();
				System.out.println("======事物回归成功======");
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}finally {
				try {
					if (connection!=null) {
						connection.close();
					}
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
			
		}
	}

}
