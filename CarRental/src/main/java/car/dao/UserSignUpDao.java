package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import car.bean.UserSignUp;
import car.util.UserSignUpUtil;

public class UserSignUpDao {
	public static void signupUser(UserSignUp u) {
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="insert into signup(fname, lname, email, mobile, password, usertype) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getPassword());
			pst.setString(6, u.getUsertype());
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {
		boolean flag=false;
		
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="select * from signup where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, email.trim());
//			System.out.println(pst.toString());
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static UserSignUp UserLogin(String email) {
		UserSignUp u=null;
		
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="select * from signup where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, email);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				u=new UserSignUp();
				u.setId(rs.getInt("id"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getLong("mobile"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public static void ChangePass(String email, String password) {
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="update signup set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, password);
			pst.setString(2, email);
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
