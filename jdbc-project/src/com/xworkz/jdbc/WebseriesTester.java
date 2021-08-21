package com.xworkz.jdbc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.jdbc.dao.WebseriesDAO;
import com.xworkz.jdbc.dao.WebseriesDAOImpl;
import com.xworkz.jdbc.dto.WebseriesDTO;
import com.xworkz.jdbc.dto.constants.Genre;
import com.xworkz.jdbc.dto.constants.StreamedIn;

public class WebseriesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebseriesDTO dto = new WebseriesDTO("Mirzapur", 300, 4, StreamedIn.NETFLIX, Genre.CRIMENOVEL, 18);
		WebseriesDTO dto1 = new WebseriesDTO("Surya", 400, 6, StreamedIn.AHA, Genre.COMEDY, 13);

		WebseriesDAO dao = new WebseriesDAOImpl();

		dao.save(dto);
		dao.save(dto1);
		int count = dao.total();
		System.out.println(count);

		int max = dao.findMaxSeason();
		System.out.println(max);

		int min = dao.findMinSeason();
		System.out.println(min);

		Collection<WebseriesDTO> coll = dao.findAll();
		coll.forEach(f -> System.out.println(f));

		Collection<WebseriesDTO> sort = dao.findAllSortByNameDesc();
		sort.forEach(g -> System.out.println(g));

		Collection<WebseriesDTO> pre = dao.findAll(m -> m.getNoOfEpisodes() > 250);
		pre.forEach(k -> System.out.println(k));

		Optional<WebseriesDTO> one = dao.findOne(g -> g.getName().equals("Surya"));
		if (one.isPresent()) {
			WebseriesDTO optional = one.get();
			System.out.println(optional);
			System.out.println("**********************************");

		}
		Collection<WebseriesDTO> collect= Arrays.asList(dto,dto1);
		dao.saveAll(collect);
	}

	
}
