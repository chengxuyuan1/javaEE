package com.jike.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.jike.dao.UserDao;
import com.jike.dao.lmpl.UserDaolmpl;
import com.jike.entity.User;
import com.jike.util.ConnectionFactory;

public class CheakUserService {
	private UserDao userDao=new UserDaolmpl();
	public boolean cheak(User user) {
		Connection connection=null;
		try {
			connection=ConnectionFactory.getInstance().makeConnection();
			connection.setAutoCommit(false);
			ResultSet resultSet=userDao.get(connection, user);
			while (resultSet.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				connection.rollback();;
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
	}
}
