package com.fita_spring_boot_l1.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fita_spring_boot_l1.model.MovieList;

@Service
public interface TheatreService {
	List<MovieList> getAllTheatresByMovieName(String name);
	List<MovieList> getRunningShowsByTheatreId(long id);
	List<MovieList>	getRunningShowsByTiming(String from_time,String to_time);
	
	
}
