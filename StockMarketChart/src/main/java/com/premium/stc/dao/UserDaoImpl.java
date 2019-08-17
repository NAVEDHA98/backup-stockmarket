package com.premium.stc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.premium.stc.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	public static Connection connect() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		System.out.println("connect");
		return con;  
	}

	public User registerUser(User user) throws Exception {
		Connection con=connect();
		PreparedStatement stmt=con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		stmt.setInt(1, user.getId());
		stmt.setString(2, user.getUserName());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getUserType());
		stmt.setString(5,user.getEmail());
		stmt.setLong(6, user.getMobileNumber());
		stmt.setBoolean(7, user.isConfirmed());
		System.out.println(stmt.execute());
		return user;
	}

	
	public User updateUser(User user) throws Exception {
		Connection con=connect();
		PreparedStatement stmt=con.prepareStatement("UPDATE user SET id=?,username=?,password=?,usertype=?,email=?,mobilenumber?,confirmed=?");
		
		return user;
	}

}
