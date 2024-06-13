package car.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import car.bean.Booking;
import car.dao.BookingDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512) // 512MB

public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);// form-data; name="product_image"; filename="shoes1.jpg"
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return " ";
	}

	public static int DateDiffInDays(String from_date, String to_date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int dayDiff = 0;
		try {
			Date pDate = sdf.parse(from_date);
			Date dDate = sdf.parse(to_date);
			long diff = dDate.getTime() - pDate.getTime();
			dayDiff = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println("Days diff: " + dayDiff);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dayDiff;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		Booking b = new Booking();

		if (action.equalsIgnoreCase("reserve now")) {

			try {
				System.out.println(request.getParameter("from_date"));
				System.out.println(request.getParameter("to_date"));

				int dd = DateDiffInDays(request.getParameter("from_date"), request.getParameter("to_date"));
				System.out.println("INT = " + dd);

				int ppd = Integer.parseInt(request.getParameter("car_ppd2"));
				System.out.println("Price per day = " + ppd);

				int total_amount = dd * ppd;
				System.out.println("Total =" + total_amount);

				b.setTotal_amount(total_amount);

			} catch (Exception e) {
				e.printStackTrace();
			}

			b.setId(Integer.parseInt(request.getParameter("id")));
			b.setCid(Integer.parseInt(request.getParameter("cid")));
			b.setFrom_date(request.getParameter("from_date"));
			b.setTo_date(request.getParameter("to_date"));
			b.setPayment_status("Pending");

			String savePath = "E:\\Tops Work\\Java work\\ClassWork\\CarRental\\src\\main\\webapp\\user_document";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("identify_document");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);

			String savePath2 = "E:\\Tops Work\\Java work\\ClassWork\\CarRental\\src\\main\\webapp\\user_document";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}

			b.setIdentify_document(fileName);
			BookingDao.addBooking(b);

			response.sendRedirect("car.jsp");
		}
	}
}
