package Holi;

import javax.servlet.http.HttpSession;

import com.login.Connection;
import com.login.Exception;
import com.login.ResultSet;
import com.login.String;
import com.mysql.jdbc.Statement;

public class salarydetails {
	
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String dob = request.getParameter("dob");
	String contact = request.getParameter("contact");
	
	
	  try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false","root","Ushasahu1");
       
Statement stmt=(Statement) con.createStatement();
  String q1="select * from emp_details where uname="+uname+" and pass="+pass+";";
  String q2="select * from emp_salary where uname="+uname+" and pass="+pass+";";
        ResultSet rs=stmt.executeQuery(q1);
        if(rs.next())
        {

			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("details.jsp");
          }
       else
       {
    	   response.sendRedirect("login.jsp");
       }
     con.close();
     }
     catch(Exception e)
     { 
        
          System.out.println(e);
     }
}
