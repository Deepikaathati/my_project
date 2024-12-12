package login;
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class Regservlet extends HttpServlet
{
	Connection con;
	public void init(servletconfig config)
	{
		try {
		Class.forName("Oracle.jdbc.driver.oracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe";"system","mnager");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			string s1=request.get Parameter("fname");
			string s2=request.get Parameter("jname");
			string s3=request.get Parameter("uname");
			string s4=request.get Parameter("pword");
PreparedStatement pstm=con.Prepare.statement("insert into uinfo values(?,?,?,?)");
pstmt.setString(1,s1);
pstmt.setString(2,s2);
pstmt.setString(3,s3);
pstmt.setString(4,s4);
PrintWriter pw=response.getwriter();
pw.println("<html><body bgcolor=green text=yellow> ");
pw.println("<h1> You Have Registred Successfully</h1>");
pw.println("<a href=login.html> login</a>");
pw.println("</center> </body></html>");
}
		catch(Exception e) {
			e.printStackTrace();
		}
		public void destory()
		{
			try {
				con.close();
			}
			catch(Exception e)
			{ e.printStackTrace();
			}
		}
}
