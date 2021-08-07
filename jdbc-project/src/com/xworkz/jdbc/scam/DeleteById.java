package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "root";
		String pass = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		try (Connection connection = DriverManager.getConnection(url, user, pass)) {
			String delete = "delete  from scam_table  where s_id=2";
			Statement statement = connection.createStatement();
			statement.execute(delete);

			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
