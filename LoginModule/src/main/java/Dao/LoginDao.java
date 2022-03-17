package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class LoginDao {

	 String sql="select * from login where username=? and password=?";
	 String url="jdbc:mysql://127.0.0.1:3306/sys";
	 String username="root";
	 String password="Ushasahu1";
	 public boolean checkcredit(String uname,String Pass) 
	 {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2, Pass);
			
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
			
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return false;
	 }
}