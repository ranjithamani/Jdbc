package com.xworkz.jdbc.technologies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologyTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fnqOfDriverImpl);
			connection = DriverManager.getConnection(url, username, password);

			String query = "insert into  technologies_table values(9,'Python','software')";
			Statement statement = connection.prepareStatement(query);
			statement.execute(query);
			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

}
