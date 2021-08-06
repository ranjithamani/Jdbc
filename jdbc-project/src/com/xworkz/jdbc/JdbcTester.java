package com.xworkz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTester {
public static void main (String[] args) {
	String username="root";
	String password="Ranju@95";
	String url="jdbc:mysql://localhost:3306/ranjitha";
	String fnqOfDriverImpl="com.mysql.cj.jdbc.Driver";
	
	try {
		Class.forName(fnqOfDriverImpl);
		Connection connection=DriverManager.getConnection(url,username,password);
		System.out.println(connection);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
