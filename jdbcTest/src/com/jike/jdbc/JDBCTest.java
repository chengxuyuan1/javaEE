package com.jike.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.catalina.storeconfig.StandardHostSF;;

public class JDBCTest {
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db?useUnicode=true&characterEncoding=utf8&useSSL=false","root","hg@564900");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
	public static void insert() {
		Connection connection=getConnection();
		try {
			String sql="INSERT INTO tbl_user(name,password,email)"+
		"VALUES('Tom','123456','tom@gmail.com')";
			Statement statement=connection.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向用户表中插入了"+count+" 条记录");
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void selectAll() {
		String sql ="SELECT * FROM tbl_user";
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db?useUnicode=true&characterEncoding=utf8&useSSL=false","root","hg@564900");
			statement=connection.createStatement();
			resultset=statement.executeQuery(sql);
			while (resultset.next()) {
				System.out.print(resultset.getInt("id")+" ");
				System.out.print(resultset.getString("name")+" ");
				System.out.print(resultset.getString("password")+" ");
				System.out.print(resultset.getString("email")+" ");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				statement.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		insert();
		selectAll();
	}
}
