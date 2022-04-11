package cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Submit extends HttpServlet {

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String item=request.getParameter("item");
		PrintWriter out=response.getWriter();
		
		storage s=new storage();
		s.addItem(item);
		request.getRequestDispatcher("Cart.jsp").forward(request, response);
	}
}
