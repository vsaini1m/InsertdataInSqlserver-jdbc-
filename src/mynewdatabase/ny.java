/**
 * 
 *  IN THIS PROGRAM THAT HOW TO SQL SERVER CONNECT ECLIPSE
 *  AND IN THIS NEEDED THE SQLJDBC DRIVER 
 * 
 * 
 */


package mynewdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ny {

	private static String url="jdbc:mysql://localhost:3306/school";
	private static String user="root";
	private static String password="root";
	
	
	public static void main(String[] args) {

		Connection con;
		Statement st;
		ResultSet rs;
		try {

			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			rs=st.executeQuery("SELECT * FROM student");
		while(	rs.next())
		{
			String id=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4);
			
			
			
			System.out.println(id);
		}		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
