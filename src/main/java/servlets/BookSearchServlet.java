package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Book;

/**
 * Servlet implementation class BookSearchServlet
 */
@SuppressWarnings("serial")
public class BookSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookName = req.getParameter("bookName");

		log(bookName);

		// truy van sach theo ten o dayArrayList<Book> books = new ArrayList<Book>();
		ArrayList<Book> books = new ArrayList<Book>();
		
		try {
			books = (new Book()).search(bookName);
			log("So sach");
			System.out.println(books.size());
		} catch (ClassNotFoundException | SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("books", books);
		RequestDispatcher view = req.getRequestDispatcher("search-result.jsp");
		view.forward(req, resp);

	}
}
