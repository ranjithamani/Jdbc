package com.xworkz.jdbc.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlowerTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection tempConnection=null;
		try (Connection connection = DriverManager.getConnection(url, username, password);){
			tempConnection=connection;
			connection.setAutoCommit(false);
			Class.forName(fnqOfDriverImpl);

			String query = "insert into flower_table(f_name,f_price,f_color,f_fragrance,f_noOfPetals,f_pedicilate,f_type,s_trimerous,f_hypogynous)values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, "Jasmine");
			statement.setInt(2, 100);
			statement.setString(3, "red");
			statement.setString(4, "rose");
			statement.setInt(5, 30);
			statement.setBoolean(6, true);
			statement.setString(7, "custom");
			statement.setBoolean(8, true);
			statement.setBoolean(9, true);
			statement.execute();
			ResultSet result = statement.getResultSet();
			
           
           connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
			
		} 
	}
	}


