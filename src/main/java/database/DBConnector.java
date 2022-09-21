package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnector{
    public static String url = "jdbc:mysql://10.220.241.211:3306/SmartLift";
    public static String user = "root";
    public static String pass = "";
    
    public static Connection getConnection() {
	Connection con = null;
	
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    con = DriverManager.getConnection(url,user,pass);
	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
	return con;
    }
    public static void main(String[] args) {
	Connection conn = getConnection();
	if (conn!=null) {
	    System.out.println("Success!");
	}
    }
}
