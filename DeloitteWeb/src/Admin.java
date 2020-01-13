

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin
 */
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//HttpSession session = request.getSession();
		//Object user = session.getAttribute("user");
		String user = request.getParameter("user");
		if(user!=null){
			
		out.println("<h2>welcome Administrator</h2>");
		out.println("<a href = Form.html>Return to Form</a>"+"<br>");
	
		}
		else{

			out.println("<h2> invalid access"+"<br>");
			out.println("<a href = Form.html>Return to Form</a>"+"<br>");
			
		}
			}

}
