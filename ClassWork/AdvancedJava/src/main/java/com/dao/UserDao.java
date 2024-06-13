package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;
import com.util.UserUtil;

public class UserDao {
	public static void insertUser(User u) {
		try {
			Connection conn=UserUtil.create_conn();
			String sql="insert into user(fname,lname,email,mobile,password) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getPassword());
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
	
	public static List<User> getAllUsers(){
		
		List<User> list=new ArrayList();
		
		try {
			Connection conn=UserUtil.create_conn();
			String sql="select * from user";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getLong("mobile"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return list;
		
	}
	
public static User getUsers(int id){
		
		User u=null;
		
		try {
			Connection conn=UserUtil.create_conn();
			String sql="select * from user where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				u=new User();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getLong("mobile"));
				u.setPassword(rs.getString("password"));				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return u;
		
	}

public static void UpadetUser(User u) {
	try {
		Connection conn=UserUtil.create_conn();
		String sql="update user set fname=?, lname=?, email=?, mobile=?, password=? where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, u.getFname());
		pst.setString(2, u.getLname());
		pst.setString(3, u.getEmail());
		pst.setLong(4, u.getMobile());
		pst.setString(5, u.getPassword());
		pst.setInt(6, u.getId());
		
		pst.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}

public static void DeleteUser(int id) {
	try {
		Connection conn=UserUtil.create_conn();
		String sql="delete from user where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setInt(1, id);		
		
		pst.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
	
}
