package com.jike.test;

import java.sql.Connection;
import com.jike.util.ConnectionFactory;

import com.jike.dao.UserDao;
import com.jike.dao.lmpl.UserDaolmpl;
import com.jike.entity.User;


public class UserDaoTest {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=ConnectionFactory.getInstance().makeConnection();
			connection.setAutoCommit(false);
			
			UserDao userDao=new UserDaolmpl();
			User user=new User();
			user.setName("tom");
			user.setPassword("123456");
			user.setEmail("tom@gamail.com");
			userDao.save(connection, user);
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				connection.rollback();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
