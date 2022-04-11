package LoginPages;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class LoginCredentials extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {

		String name=req.getParameter("username");
		String password=req.getParameter("password");
		if(name.equals("harsha") && password.equals("harsha&982")) {
			HttpSession session=req.getSession();
			session.setAttribute("name",name);
			res.sendRedirect("Welcome.jsp");
		}
		else {
			res.sendRedirect("Login.jsp");
		}
		
	}
}

