package com.xworkz.jdbc.insurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsuranceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="root";
		String password="Ranju@95";
		String url="jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl="com.mysql.cj.jdbc.Driver";
	Connection connection=null;
		try {
			Class.forName(fnqOfDriverImpl);
		 connection=DriverManager.getConnection(url, username, password);
		String query="insert into insurance_table values(6,'KUMAR','HONDA',16,'IDFC',9900)";
		Statement statement=connection.createStatement();
		statement.execute(query);
		System.out.println(connection);

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		finally {
			try {
			connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
