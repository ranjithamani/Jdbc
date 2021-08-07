package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AmountByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "root";
		String pass = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		try (Connection connection = DriverManager.getConnection(url, user, pass)) {
			String update="update scam_table set s_amount=56000 where s_name='Telgi scam'";
			Statement statement = connection.createStatement();
			statement.execute(update);
			
			System.out.println(connection);
		} catch (SQLException  e) {
			e.printStackTrace();

		}
	}

}
