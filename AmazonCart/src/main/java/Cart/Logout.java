package Cart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException , ServletException  {
		HttpSession session=request.getSession();
		session.removeAttribute("name");
		session.invalidate();
		response.getWriter().println("You have Logged Out Successfully");
	}
}
