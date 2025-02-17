package car.controller;

import java.io.File;
import java.io.IOException;

import car.bean.Car;
import car.bean.UserSignUp;
import car.dao.CarDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512) // 512MB

public class AddCarController extends HttpServlet {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("add car")) {
			HttpSession session = request.getSession();
			UserSignUp u = (UserSignUp) session.getAttribute("u");

			Car c = new Car();

			c.setid(u.getId());
			c.setCar_company(request.getParameter("car_company"));
			c.setCar_name(request.getParameter("car_name"));
			c.setCar_mileage(Integer.parseInt(request.getParameter("car_mileage")));
			c.setCar_transmission(request.getParameter("car_transmission"));
			c.setCar_capacity(Integer.parseInt(request.getParameter("car_capacity")));
			c.setCar_luggage_cap(Integer.parseInt(request.getParameter("car_luggage_cap")));
			c.setCar_fuel(request.getParameter("car_fuel"));
			c.setCar_ppd(Long.parseLong(request.getParameter("car_ppd")));

			String savePath = "E:\\Tops Work\\Java work\\ClassWork\\CarRental\\src\\main\\webapp\\car_images";
			File fileSaveDir = new File(savePath);

			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}

			Part file1 = request.getPart("car_image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);

			String savePath2 = "E:\\Tops Work\\Java work\\ClassWork\\CarRental\\src\\main\\webapp\\car_images";
			File imgSaveDir = new File(savePath2);

			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}

			c.setCar_image(fileName);
			CarDao.addCar(c);

			request.setAttribute("msg", "Car Added Successfully.");
			request.getRequestDispatcher("view-car.jsp").forward(request, response);
		}

		else if (action.equalsIgnoreCase("update car")) {
			Car c = new Car();

			c.setCid(Integer.parseInt(request.getParameter("cid")));
			c.setCar_company(request.getParameter("car_company"));
			c.setCar_name(request.getParameter("car_name"));
			c.setCar_mileage(Integer.parseInt(request.getParameter("car_mileage")));
			c.setCar_transmission(request.getParameter("car_transmission"));
			c.setCar_capacity(Integer.parseInt(request.getParameter("car_capacity")));
			c.setCar_luggage_cap(Integer.parseInt(request.getParameter("car_luggage_cap")));
			c.setCar_fuel(request.getParameter("car_fuel"));
			c.setCar_ppd(Long.parseLong(request.getParameter("car_ppd")));

			CarDao.updateCar(c);
			request.setAttribute("msg", "Car Updated Successfully.");
			request.getRequestDispatcher("view-car.jsp").forward(request, response);

		}
	}

}
