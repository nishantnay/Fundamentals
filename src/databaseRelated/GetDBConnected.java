package databaseRelated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetDBConnected {
	private static Connection conn;
	
	public Connection getConnection() throws Exception{
		
		//Class.forName("com.mysql.jdbc.Driver");
		//Driver driver= new Driver();
		//DriverManager.registerDriver(Driver.class);
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement", "root", "Password@1234");
		
	}

	public static void main(String[] args) throws Exception {
		
		conn= new GetDBConnected().getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet rs= st.executeQuery("select * from student");
		rs.beforeFirst();
		int first= rs.getRow();
		rs.last();
		int last=rs.getRow();
		System.out.println(last-first);
		
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
		
		conn.close();
	}
}
