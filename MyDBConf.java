package sess.jun2IPLProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDBConf {

	static String url=null;
	static String username=null;
	static String password=null;
	static Connection con =null;
	
	public static Connection getMyDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/kiran_academy";
            username="root";
            password="root";
            con=DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
