package com.fita_spring_boot_l1.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fita_spring_boot_l1.model.MovieList;

@Service
public interface TheatreService {
	List<MovieList> getAllTheatresByName(String name);
}
