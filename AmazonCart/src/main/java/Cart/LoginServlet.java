package Cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/Login.do")
public class LoginServlet extends HttpServlet{
	private UserValidationService userValidationService =new UserValidationService();
	private TodoService todoService=new TodoService();
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
//		---------Validation---------
		
		boolean isUserValid=userValidationService.isUserValid(name, password);
		
//		---------Main Process--------
		
 		if(isUserValid) {
 			response.sendRedirect("Todo.do");
 		}
 		else {
 			request.setAttribute("ErrorMessage", "Invalid Credentials");
 	 		request.getRequestDispatcher("/Login.jsp").forward(request, response);

 		}
 		
	}

}
