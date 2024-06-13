package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import car.bean.Car;
import car.util.UserSignUpUtil;

public class CarDao {
	
	public static void addCar(Car c)
	{
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="insert into car(id,car_company,car_name,car_mileage,car_transmission,car_capacity,car_luggage_cap,car_fuel,car_image,car_ppd) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1, c.getid());
			pst.setString(2, c.getCar_company());
			pst.setString(3, c.getCar_name());
			pst.setInt(4, c.getCar_mileage());
			pst.setString(5, c.getCar_transmission());
			pst.setInt(6, c.getCar_capacity());
			pst.setInt(7, c.getCar_luggage_cap());
			pst.setString(8, c.getCar_fuel());
			pst.setString(9, c.getCar_image());
			pst.setLong(10, c.getCar_ppd());
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateCar(Car c)
	{
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="update car set car_company=?, car_name=?, car_mileage=?, car_transmission=?, car_capacity=?, car_luggage_cap=?, car_fuel=?, car_ppd=? where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, c.getCar_company());
			pst.setString(2, c.getCar_name());
			pst.setInt(3, c.getCar_mileage());
			pst.setString(4, c.getCar_transmission());
			pst.setInt(5, c.getCar_capacity());
			pst.setInt(6, c.getCar_luggage_cap());
			pst.setString(7, c.getCar_fuel());
//			pst.setString(8, c.getCar_image());
			pst.setLong(8, c.getCar_ppd());
			pst.setInt(9, c.getCid());
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteCar(int cid)
	{
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="delete from car where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1, cid);
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Car> getCarsByUser(int id)
	{
		List<Car> list=new ArrayList<Car>();
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="select * from car where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1, id);
			
			ResultSet rs=pst.executeQuery();
			
			while (rs.next())
			{
				Car c=new Car();
				c.setCid(rs.getInt("cid"));
				c.setid(rs.getInt("id"));
				c.setCar_company(rs.getString("car_company"));
				c.setCar_name(rs.getString("car_name"));
				c.setCar_mileage(rs.getInt("car_mileage"));
				c.setCar_transmission(rs.getString("car_transmission"));
				c.setCar_capacity(rs.getInt("car_capacity"));
				c.setCar_luggage_cap(rs.getInt("car_luggage_cap"));
				c.setCar_fuel(rs.getString("car_fuel"));
				c.setCar_image(rs.getString("car_image"));
				c.setCar_ppd(rs.getInt("car_ppd"));
				
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Car> getAllCars()
	{
		List<Car> list=new ArrayList<Car>();
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="select * from car";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			
			while (rs.next())
			{
				Car c=new Car();
				c.setCid(rs.getInt("cid"));
				c.setid(rs.getInt("id"));
				c.setCar_company(rs.getString("car_company"));
				c.setCar_name(rs.getString("car_name"));
				c.setCar_mileage(rs.getInt("car_mileage"));
				c.setCar_transmission(rs.getString("car_transmission"));
				c.setCar_capacity(rs.getInt("car_capacity"));
				c.setCar_luggage_cap(rs.getInt("car_luggage_cap"));
				c.setCar_fuel(rs.getString("car_fuel"));
				c.setCar_image(rs.getString("car_image"));
				c.setCar_ppd(rs.getInt("car_ppd"));
				
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Car getCars(int cid)
	{
		Car c=null;
		try {
			Connection conn=UserSignUpUtil.createConnection();
			String sql="select * from car where cid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1, cid);
			
			ResultSet rs=pst.executeQuery();
			
			if (rs.next())
			{
				c=new Car();
				c.setCid(rs.getInt("cid"));
				c.setid(rs.getInt("id"));
				c.setCar_company(rs.getString("car_company"));
				c.setCar_name(rs.getString("car_name"));
				c.setCar_mileage(rs.getInt("car_mileage"));
				c.setCar_transmission(rs.getString("car_transmission"));
				c.setCar_capacity(rs.getInt("car_capacity"));
				c.setCar_luggage_cap(rs.getInt("car_luggage_cap"));
				c.setCar_fuel(rs.getString("car_fuel"));
				c.setCar_image(rs.getString("car_image"));
				c.setCar_ppd(rs.getInt("car_ppd"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
}
