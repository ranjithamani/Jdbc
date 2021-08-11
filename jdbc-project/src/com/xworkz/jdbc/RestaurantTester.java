package com.xworkz.jdbc;

import com.xworkz.jdbc.dao.RestaurantDAO;
import com.xworkz.jdbc.dao.RestaurantDAOImpl;
import com.xworkz.jdbc.dto.RestaurantDTO;
import com.xworkz.jdbc.dto.restaurant.constants.*;


public class RestaurantTester {

	public static void main(String[] args) {
		RestaurantDTO dto1= new RestaurantDTO("Nammora Ahaar","SSpuram","gobi", true, RestaurantType.FAST_FOOD);
		RestaurantDAO dao=new RestaurantDAOImpl();
		dao.save(dto1);
		
	}

}
