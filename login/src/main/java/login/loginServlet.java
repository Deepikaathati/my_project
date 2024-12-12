package login;
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class loginServlet extends HttpServlet
{
	Connection con;
		public void init(servletconfig config)
		{ try {
			Class.forName("Oracle.jdbc.driver.oracleDriver");
			con=DriverManager.getconnection("jdbc:oracle:thin@localhost:1521:xe";"system","mnager");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			try {
				string s1=request.get Parameter("uname");
				string s2=request.get Parameter1("pword");
	 PreparedStatement pstm=con.Preparestatement("select* from uinfo where uname=? and Pword=?");
	 pstmt.setString(1,s1);
	 pstmt.setString(2,s2);
	 Resultset rs=pstmt.executeQuery();
	 PrintWriter pw=response.getwriter();
	 pw.println("<html><body bgcolor=cyan text=blue><h1>");
	 if(rs.next())
	   {
		pw.println("Welcome" +s1);
	   }
	   else {
		pw.println("Invalid Username|Password");
	    }
           	pw.println("</h1></body></html>");
	} catch(Exception e) {
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
	
