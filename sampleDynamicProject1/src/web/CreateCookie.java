package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookie
 */
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		Cookie ck1 = new Cookie("name" , "deloitte");
		Cookie ck2 = new Cookie("mailid" , "abcd@gmail.com");
		out.println("Cookies Created");
		ck2.setMaxAge(24*60*60);
		response.addCookie(ck1);
		response.addCookie(ck2);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
