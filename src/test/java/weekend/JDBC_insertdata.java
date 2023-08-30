package weekend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBC_insertdata {

	public static void main(String[] args) throws Throwable {
       Driver driverref = new Driver();
		
		DriverManager.registerDriver(driverref);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider_info", "root", "root");
		
		Statement statement = connection.createStatement();
		
		String query = "insert into Qsp_student(first_name,last_name,address)values('kavita','sharma','banglore')";
	
		int result = statement.executeUpdate(query);
		
		if(result==1)
		{
			System.out.println("updated");
			
		}
		
		else
			System.out.println("not updated");
	
	}
	
	

}
