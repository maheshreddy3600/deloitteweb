

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int count=0;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("**INIT METHOD EXECUTED**");
	}

	public void destroy() {
	System.out.println("**DESTROY METHOD EXECUTED**");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.println("<h2>" +count++);
	}

}
