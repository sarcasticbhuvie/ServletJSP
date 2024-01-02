package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myinfo")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		System.out.println("Name : "+name);
		System.out.println("email : "+email);
		PrintWriter out = res.getWriter();
		out.println("Name : "+name);
		out.println("email : "+email);
	}
}
