package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateByAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "root";
		String pass = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		try (Connection connection = DriverManager.getConnection(url, user, pass)) {
			Class.forName(fnqOfDriverImpl);
			String update = "update scam_table set s_year=2022 , s_amount=10000, s_location='Bangalore',s_type='Bank Loan' where s_name='VijayMalya Scam' and s_id=5";
			Statement statement = connection.createStatement();
			statement.execute(update);

			System.out.println(connection);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

}
