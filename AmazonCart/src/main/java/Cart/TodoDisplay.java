package Cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Todo.do")
public class TodoDisplay extends HttpServlet{
	private TodoService todoService=new TodoService();
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		todoService.addTodos(request.getParameter("todo"));
 		request.setAttribute("todos", todoService.retriveTodos());
	 	request.getRequestDispatcher("/Todo.jsp").forward(request, response);
 		
	}

}
