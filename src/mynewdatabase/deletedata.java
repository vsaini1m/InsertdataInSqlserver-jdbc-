package mynewdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deletedata {
public static void main(String[] args) {
	Connection con;
	Statement st;
	ResultSet rs;
	
	try {
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		st=con.createStatement();
		st.execute("Delete from studentdata Where roll_no=20");
		System.out.println("data deleted");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
