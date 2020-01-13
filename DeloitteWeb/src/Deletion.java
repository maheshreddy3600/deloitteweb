import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

@WebServlet("/Deletion")
public class Deletion extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
int empno=Integer.parseInt(request.getParameter("empno"));


int rows=0;
EmpDao dao = new EmpDaoImpl();
rows=dao.deletion(empno);
if(rows>0)
{
out.println("deleted<br>");
out.println(empno);
}
else
out.println("not deleted");
}
}
