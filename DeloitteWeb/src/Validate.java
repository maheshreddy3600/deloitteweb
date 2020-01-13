

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String psw = request.getParameter("psw");
		RequestDispatcher rd; 
		if(user.isEmpty()||psw.isEmpty()){
			out.println("<font color =red>Invalid input</font>");
			rd = request.getRequestDispatcher("Form.html");
		    rd.include(request, response);			
			//out.println("<a href = Form.html>Return to Form</a>"+"<br>");			
		}
		else{ 
			if(user.equals("admin")&&psw.equals("admin"))
				
			rd = request.getRequestDispatcher("Admin");
			
		else
			rd =request.getRequestDispatcher("User");
		//rd.forward(request, response);
		rd.include(request, response);
		out.println("sucess");
		}
	}

}
