package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookSearchServlet
 */
@SuppressWarnings("serial")
public class BookSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookName = req.getParameter("bookName");

		log(bookName);

		// truy van sach theo ten o day

//		req.setAttribute("bookName", bookName);
		RequestDispatcher view = req.getRequestDispatcher("search-result.jsp");
		view.forward(req, resp);

	}
}
