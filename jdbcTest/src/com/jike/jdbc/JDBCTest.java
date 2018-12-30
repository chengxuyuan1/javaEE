package com.jike.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;;

public class JDBCTest {
	public static void main(String[] args) {
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
}
