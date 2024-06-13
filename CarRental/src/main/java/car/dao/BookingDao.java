package car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import car.bean.Booking;
import car.util.UserSignUpUtil;

public class BookingDao {

	public static void addBooking(Booking b) {
		try {
			Connection conn = UserSignUpUtil.createConnection();
			String sql = "insert into booking(id,cid,from_date,to_date,identify_document,payment_status,total_amount) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, b.getId());
			pst.setInt(2, b.getCid());
			pst.setString(3, b.getFrom_date());
			pst.setString(4, b.getTo_date());
			pst.setString(5, b.getIdentify_document());
			pst.setString(6, b.getPayment_status());
			pst.setInt(7, b.getTotal_amount());

			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Booking> getBookingByUser(int id) {
		List<Booking> list = new ArrayList<Booking>();
		try {
			Connection conn = UserSignUpUtil.createConnection();
			String sql = "select * from booking where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Booking b = new Booking();
				b.setBid(rs.getInt("bid"));
				b.setId(rs.getInt("id"));
				b.setCid(rs.getInt("cid"));
				b.setFrom_date(rs.getString("from_date"));
				b.setTo_date(rs.getString("to_date"));
				b.setIdentify_document(rs.getString("identify_document"));
				b.setPayment_status(rs.getString("payment_status"));
				b.setTotal_amount(rs.getInt("total_amount"));

				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Booking getBooking(int bid) {
		Booking b = null;

		try {
			Connection conn = UserSignUpUtil.createConnection();
			String sql = "select * from booking where bid=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, bid);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				b = new Booking();
				b.setBid(rs.getInt("bid"));
				b.setCid(rs.getInt("cid"));
				b.setId(rs.getInt("id"));
				b.setFrom_date(rs.getString("from_date"));
				b.setTo_date(rs.getString("to_date"));
				b.setIdentify_document(rs.getString("identify_document"));
				b.setPayment_status(rs.getString("payment_status"));
				b.setTotal_amount(rs.getInt("total_amount"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	public static void updatePaymentStatus(int bid) {
		String payment_status = "paid";

		try {
			Connection conn = UserSignUpUtil.createConnection();
			String sql = "update booking set payment_status=? where bid=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, payment_status);
			pst.setInt(2, bid);

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
