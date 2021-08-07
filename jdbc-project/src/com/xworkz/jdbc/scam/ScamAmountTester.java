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
		try (Connection connection = DriverManager.getConnection(url, user, pass)) {
			String query1 = "insert into scam_table values(1,' Commonwealth Gamesscam','Games',2010,' Suresh Kalmadi',70000,'New dehli','criminal conspiracy cheating and forgery ')";
			String query2 = "insert into scam_table values(2,' 2G Spectrum scam','Telecom',2012,'A.Raja',176000,'New dehli',' issuing duplicate licenses to create 2G spectrumsubscriptions')";
			String query3 = "insert into scam_table values(3,'Harshad Mehta scam','Bank',1992,'Harshad Mehta',5000,'Mumbai','marketing forgery and  Bombay Stock Exchange')";
			String query4 = "insert into scam_table values(4,'Satyam scam','Computers',2015,'Ramalingaraju',14000,'Hydarabad','satyam computer manufacture company misrepresented its accounts ')";
			String query5 = "insert into scam_table values(5,'VijayMalya Scam','Finacial',2016,'VijayMalya',9000,'Mumbai','bank loan  amount scam in SBI bank')";
			String query6 = "insert into scam_table values(6,'Telgi scam','finacial',2001,'Abdul Karim Telgi',20000,'Rajastan','printing duplicate stamp papers')";
			String query7 = "insert into scam_table values(7,'Saradha Group chit fund scam','Financial',2013,' Debjani Mukhopadhdhay ',15300,'West Bengal.','variety of collective investment schemes')";
			String query8 = "insert into scam_table values(8,'Bellary mining scam','Mining leases',2006,'Reddy brothers',16000,'Bellary','exchange for issuing mining leases ')";
			String query9 = "insert into scam_table values(9,'cash-for-votes scandal','Election',2008,'Soniya Gandhi',20000,'India','to pursue the Indo-US nuclear deal ')";
			String query10 = "insert into scam_table values(10,'Coal scam','corruption',2000,' Abhishek Banerjee ',40000,'Bengal','imprisonment in a coal block ')";
			String query11 = "insert into scam_table values(21,'IPL Scam','BCCI',2013,'Arun Jaitley',35700,'Pune','IPL Scam')";
			String query12 = "insert into scam_table values(12,'Hawala Scandal','Banking',1996,'N K Jain',18000,'India','Money transfer based on owner')";
			String query13 = "insert into scam_table values(13,'Chopper Scam','Helicaptors',2013,'Santosh Bagrodia, Satish Bagrodia',38000,'Italy','VVIP helicopter deal')";
			String query14 = "insert into scam_table values(14,'Railgate Scam','Indian Railway Board',2012,' Pawan Kumar Bansal',7000,'India','with the help of  telephonic conversations ')";
			String query15 = "insert into scam_table values(15,'Tatra truck scam','Bharat Earth Movers Ltd (BEML)',2011,'VK Singh',14000,'India',' purchase of components for Tatra trucks')";
			String query16 = "insert into scam_table values(16,'Stock market scam','Trading',2010,'Ketan Parekh',8000,'India','involved in circular trading ')";
			String query17 = "insert into scam_table values(17,' Fodder scam','fictitious livestock',1996,'Jagannath Mishra',950,'India','medicines and animal husbandry equipment')";
			String query18 = "insert into scam values(18,'Oil and Food Scam','Food',2005,'Adithya Khanna',6000,'Delhi','The wheels of bureaucracy grind slow','the Justice R.S. Pathak Inquiry Authority to probe the allegations.')";
			String query19="insert into scam values(19,' Coalgate Scam ',' Coalgate',2012,'UPA government',186000,'UP',' is a political scandal that surfaced in 2012 when the UPA government was in power')";
			String query20 = "insert into scam values(20,'PNB scam','Bank',2016,'King of good times Vijay Mallya',9000,'Karnataka','rs 9000cr which he had taken as a loan ')";

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
			statement.execute(query11);
			statement.execute(query12);
			statement.execute(query13);
			statement.execute(query14);
			statement.execute(query15);
			statement.execute(query16);
			statement.execute(query17);
			statement.execute(query18);
			statement.execute(query19);
			statement.execute(query20);
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
