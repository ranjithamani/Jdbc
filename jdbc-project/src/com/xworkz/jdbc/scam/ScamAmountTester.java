package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamAmountTester {

	public static void main(String[] args) {
		String user = "root";
		String pass = "Ranju@95";
		String url = "jdbc:mysql://localhost:3306/ranjitha";
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		try (Connection connection = DriverManager.getConnection(url, user, pass)) {
			Class.forName(fnqOfDriverImpl);
			String query1 = "insert into scam_table values(1,' Commonwealth Gamesscam','Games',2010,' Suresh Kalmadi',70000,'New dehli','criminal conspiracy cheating and forgery ')";
			String query2 = "insert into scam_table values(2,' 2G Spectrum scam','Telecom',2012,'A.Raja',176000,'New dehli','licenses create 2G spectrumsubscriptions')";
			String query3 = "insert into scam_table values(3,'Harshad Mehta scam','Bank',1992,'Harshad Mehta',5000,'Mumbai','Bombay Stock Exchange')";
			String query4 = "insert into scam_table values(4,'Satyam scam','Computers',2015,'Ramalingaraju',14000,'Hydarabad','company misrepresented its accounts')";
			String query5 = "insert into scam_table values(5,'VijayMalya Scam','Finacial',2016,'VijayMalya',9000,'Mumbai','bank loan scam')";
			String query6 = "insert into scam_table values(6,'Telgi scam','finacial',2001,'Abdul Karim Telgi',20000,'Rajastan','printing duplicate stamp papers')";
			String query7 = "insert into scam_table values(7,'Saradha Group chit fund scam','Financial',2013,' Debjani Mukhopadhdhay ',15300,'West Bengal.','variety of collective investment schemes')";
			String query8 = "insert into scam_table values(8,'Bellary mining scam','Mining leases',2006,'Reddy brothers',16000,'Bellary','xchange for issuing mining leases ')";
			String query9 = "insert into scam_table values(9,'cash-for-votes scandal','Election',2008,'Soniya Gandhi',20000,'India','to pursue the Indo-US nuclear deal ')";
			String query10 = "insert into scam_table values(10,'Coal scam','corruption',2000,' Abhishek Banerjee ',40000,'Bengal','imprisonment in a coal block ')";
			Statement statement = connection.createStatement();
			statement.execute(query1);
			statement.execute(query2);
			statement.execute(query3);
			statement.execute(query4);
			statement.execute(query5);
			statement.execute(query6);
			statement.execute(query7);
			statement.execute(query8);
			statement.execute(query9);
			statement.execute(query10);
			System.out.println(connection);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
	}
}
