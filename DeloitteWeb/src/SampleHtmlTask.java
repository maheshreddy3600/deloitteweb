

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleHtmlTask
 */
public class SampleHtmlTask extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("empname");
		
		String email=request.getParameter("mailid");
		String date=request.getParameter("jdate");
		String job=request.getParameter("job");
		String sal=request.getParameter("salary");
		/*if array used in html String job=request.getParameterValues("job");
		for(String s:skills)
			out.println(s+" "); */
		out.println("Employee name="+name+"<br>");
		out.println("salary is"+sal);
		out.println("Employee email="+email+"<br>");
		out.println("Employee joining date="+date+"<br>");
		out.println("Employee job="+job+"<br>");
		
		out.println(request.getRequestURI());
		out.println(request.getLocalPort());
		out.println(request.getServerName());
		out.println(request.getContentType());
		out.println(request.getRemoteAddr());
		out.println(request.getRequestURI());
		out.println(request.getServletPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
