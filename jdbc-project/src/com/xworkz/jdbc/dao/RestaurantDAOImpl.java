package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.dto.RestaurantDTO;
import com.xworkz.jdbc.dto.constants.RestaurantType;

import static com.xworkz.jdbc.dto.constants.JdbcConstant.*;

public class RestaurantDAOImpl implements RestaurantDAO {

	@Override
	public int save(RestaurantDTO dto) {
		System.out.println(dto);
		Connection tempConnection = null;
		int temp = 0;
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
			String query = "insert into restaurant_table(r_name,r_location,r_specialFood,r_best,r_type) values('"
					+ dto.getName() + "','" + dto.getLocation() + "','" + dto.getSpecialFood() + "'," + dto.isBest()
					+ ",'" + dto.getType() + "')";
			Statement statement = connection.createStatement();
			statement.execute(query, Statement.RETURN_GENERATED_KEYS);
			ResultSet result = statement.getGeneratedKeys();
			if (result.next()) {
				temp = result.getInt(1);
				System.out.println(temp);
			}
			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();

			}
		}
		return temp;
	}

	@Override
	public RestaurantDTO findByName(String name) {
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String query = "select * from restaurant_table where r_name='" + name + "'";
			Statement statement = connection.createStatement();
			statement.execute(query);
			ResultSet result = statement.getResultSet();
			if (result.next()) {
				int id = result.getInt("r_id");
				String rsname = result.getString("r_name");
				String location = result.getString("r_location");
				String special = result.getString("r_specialFood");
				boolean best = result.getBoolean("r_best");
				String type = result.getString("r_type");

				RestaurantDTO dto = new RestaurantDTO(rsname, location, special, best, RestaurantType.valueOf(type));
				dto.setId(id);
				return dto;

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public Collection<RestaurantDTO> findByType(RestaurantType type) {
		Collection<RestaurantDTO> collection = new ArrayList<RestaurantDTO>();
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			String query = "select * from restaurant_table where r_type='" + type + "'";
			Statement statement = connection.createStatement();
			statement.execute(query);
			ResultSet result = statement.getResultSet();
			while (result.next()) {
				int id = result.getInt("r_id");
				String rsname = result.getString("r_name");
				String location = result.getString("r_location");
				String special = result.getString("r_specialFood");
				boolean best = result.getBoolean("r_best");
				String rstype = result.getString("r_type");

				RestaurantDTO dto = new RestaurantDTO(rsname, location, special, best, RestaurantType.valueOf(rstype));
				dto.setId(id);
				collection.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return collection;
	}

	@Override
	public boolean updateTypeByName(RestaurantType newtype, String name) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			connection.setAutoCommit(false);
			String query = "UPDATE restaurant_table SET r_type = '" + newtype + "'" + "WHERE r_name = '" + name + "'";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByTypeAndName(RestaurantType newtype, String name) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			connection.setAutoCommit(false);
			String query = "DELETE FROM restaurant_table WHERE r_type = '" + newtype + "' AND r_name = '" + name + "'";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
