package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;

import models.User;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public LoginServlet() throws NamingException {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			// truy van co so du lieu bang model user
			if ((new User()).login(username, password)) {
				HttpSession session = req.getSession();
				session.setAttribute("uname", username);
				resp.sendRedirect("search-form.jsp");
			} else {
				log("Thong tin dang nhap khong dung");
				req.setAttribute("errorMessage", "The username or password is incorrect");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException | NamingException e) {
			e.printStackTrace();
		}
	}
}
