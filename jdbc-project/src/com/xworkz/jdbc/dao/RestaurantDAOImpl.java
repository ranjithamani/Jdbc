package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.dto.RestaurantDTO;
import static com.xworkz.jdbc.dto.constants.JdbcConstant.*;

public class RestaurantDAOImpl implements RestaurantDAO {

	@Override
	public int save(RestaurantDTO dto) {
		Connection tempConnection = null;
		try (Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
			String query = "insert into restaurant_table values(1,'" + dto.getName() + "','" + dto.getLocation() + "','"
			+ dto.getSpecialFood() + "'," + dto.isBest() + ",'" + dto.getType() +"')";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();

			}
		}
		return 0;
	}
}
