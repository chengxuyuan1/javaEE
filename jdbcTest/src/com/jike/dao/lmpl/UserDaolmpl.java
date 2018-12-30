package com.jike.dao.lmpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.jike.dao.UserDao;
import com.jike.entity.User;

public class UserDaolmpl implements UserDao {

	@Override
	public void save(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=connection.prepareCall("INSERT INTO tbl_user(name,password,email)"
				+ "values(?,?,?)");
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.execute();
	}

	@Override
	public void update(Connection connection, Long id, User user) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql="UPDATE tbl_user SET name=?,password=?,email=？"
				+ "WHERE id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(updateSql);
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setLong(4, id);
		preparedStatement.execute();
	}

	@Override
	public void delete(Connection connection,User user) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql="DELETE FROM tbl_user WHERE id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(updateSql);
		preparedStatement.setLong(1, user.getId());
		preparedStatement.execute();
	}
	
}
