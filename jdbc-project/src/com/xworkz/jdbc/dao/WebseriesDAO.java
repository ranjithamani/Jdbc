package com.xworkz.jdbc.dao;

import java.util.Collection;
import java.util.function.Predicate;

import com.xworkz.jdbc.dto.WebseriesDTO;

public interface WebseriesDAO {
	int save(WebseriesDTO dto);
	int total();
	int findMaxSeason();
	int findMinSeason();
	Collection<WebseriesDTO> findAll();
	Collection<WebseriesDTO> findAllSortByNameDesc();
	Collection<WebseriesDTO> findAll(Predicate<WebseriesDTO> predicate);
}
