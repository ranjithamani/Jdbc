package com.xworkz.jdbc.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FlowerTester5 {

	public static void main(String[] args) {
		String username = "root";
		String password = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		try (Connection connection = DriverManager.getConnection(url, username, password);){
			Class.forName(fnqOfDriverImpl);

			String query = "insert into  flower_table (f_name,f_price,f_color,f_fragrance,f_noOfPetals,f_pedicilate,f_type,s_trimerous,f_hypogynous)values('Lily',150,'White','lotus',6,true,'custom',true,true)";
			Statement statement = connection.createStatement();
			statement.execute(query);
			//ResultSet result=statement.getResultSet();

			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
