package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UserDao;
import Dto.User;

@WebServlet("/forgotpassword")
public class ForgotPassword extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int userid = Integer.parseInt(req.getParameter("userid"));
		UserDao dao = new UserDao();
		User user = dao.find(userid);

		if (user == null) {
			resp.getWriter().print("<h1 style='color:red'>Invalid Id</h1>");
			req.getRequestDispatcher("Login.html").include(req, resp);
		} else {
			
			long mobile = Long.parseLong(req.getParameter("mobile"));
			Date dob = Date.valueOf(req.getParameter("dob"));
			String password = req.getParameter("password");
			if (mobile == user.getMobile() && dob.equals(user.getDob())) {
				user.setPassword(password);
				dao.update(user);
				
				resp.getWriter().print("<h1 style='color:green'>Password updated successfully</h1>");
				req.getRequestDispatcher("Login.html").include(req, resp);

			} else {
				resp.getWriter().print("<h1 style='color:red'>Invalid Details</h1>");
				req.getRequestDispatcher("ForgotPassword.html").include(req, resp);

			}
		}

	}
}




