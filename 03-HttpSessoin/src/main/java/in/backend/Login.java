package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = (String) req.getParameter("email");
		String pass = (String) req.getParameter("pass");
		PrintWriter out = res.getWriter();
		if(email.equals("bhupendra@gmail.com")&&pass.equals("12345")) {
			HttpSession session = req.getSession();
			session.setAttribute("name", "Bhupendra Verma");
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
		}
		else {
			res.setContentType("text/html");
			out.print("WEnter a valid email and password");
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		}
		
	}