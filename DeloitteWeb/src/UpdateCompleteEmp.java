

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

@WebServlet("/UpdateCompleteEmp")
public class UpdateCompleteEmp extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
String name =request.getParameter("ename");
String job=request.getParameter("job");
int managerId=Integer.parseInt(request.getParameter("mgr"));
String hireDate=request.getParameter("hiredate");
int salary=Integer.parseInt(request.getParameter("sal"));
int commission=Integer.parseInt(request.getParameter("comm"));
int departmentNo=Integer.parseInt(request.getParameter("deptno"));
int empno=Integer.parseInt(request.getParameter("empno"));
int rows=0;


EmpDao dao = new EmpDaoImpl();
rows=dao.updateCompleteEmp(name,job,managerId,hireDate,salary,commission,departmentNo,empno);
if(rows>0)
{
out.println("updated<br>");
out.println(empno+" "+name+" "+job+" "+managerId+" "+hireDate+" "+salary+" "+commission+" "+departmentNo);
}
else
out.println("not updated");


}

}