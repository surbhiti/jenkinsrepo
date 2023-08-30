package weekend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBC_fetchdata {

	public static void main(String[] args) throws Throwable {
		Driver driverref = new Driver();
		
		DriverManager.registerDriver(driverref);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider_info", "root", "root");
		
		Statement statement = connection.createStatement();
		String query = "select * from Qsp_student";
		ResultSet result = statement.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		
		connection.close();
	}

}
