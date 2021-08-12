package com.xworkz.jdbc;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.jdbc.dao.RestaurantDAO;
import com.xworkz.jdbc.dao.RestaurantDAOImpl;
import com.xworkz.jdbc.dto.RestaurantDTO;
import com.xworkz.jdbc.dto.constants.RestaurantType;

public class RestaurantTester {

	public static void main(String[] args) {
		RestaurantDTO dto = new RestaurantDTO("Jetlag", "RajajiNagar", "Fries", true, RestaurantType.BAR);
		RestaurantDTO dto1 = new RestaurantDTO("Udupi Ruchi Grand", "Yashwanthpur", "Dose", true,
				RestaurantType.FAMILY);
		RestaurantDAO dao = new RestaurantDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		RestaurantDTO byName = dao.findByName("Navya Bar And Restaurant");
		System.out.println(byName);

		Collection<RestaurantDTO> byType = dao.findByType(RestaurantType.FAST_FOOD);
		byType.forEach(t -> System.out.println(t));

		boolean update = dao.updateTypeByName(RestaurantType.FAMILY, "Jetlag");
		System.out.println(update);
		
		boolean delete=dao.deleteByTypeAndName(RestaurantType.FAMILY, "Udupi Ruchi Grand");
		System.out.println(delete);
		
	}

}
