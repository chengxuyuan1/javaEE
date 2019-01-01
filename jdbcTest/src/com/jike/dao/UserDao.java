package com.jike.dao;
import  com.jike.entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jike.entity.User;

public interface UserDao {
	public void save(Connection connection,User user) throws SQLException;
	public void update(Connection connection,Long id,User user) throws SQLException;
	public void delete(Connection connection,User user) throws SQLException;
	public ResultSet get(Connection connection,User user) throws SQLException;
}
