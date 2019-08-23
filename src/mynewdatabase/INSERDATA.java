package mynewdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class INSERDATA {
private static String url="jdbc:mysql://localhost:3306/school";
private static String user="root";
private  static String password="root";

	
	public static void main(String[] args) {

	Connection con;
	PreparedStatement st;
	ResultSet rs;
	
	int age=25;
	int id=109;
	String frst="rajan";
	String last="choudhary";
	
	
	
	try {
		con=DriverManager.getConnection(url, user, password);
		st=con.prepareStatement("Delete * FROM student  WHERE id=?");
		
		st.setInt(1,age);
//		st.setInt(2,id);
//		st.setString(3,frst);
//		st.setString(4,last);
//		
		int Count=st.executeUpdate();
		
		
		System.out.println("data inserted");
	}catch(Exception e){
		System.out.println(e);
	}
	
	
	}
}




