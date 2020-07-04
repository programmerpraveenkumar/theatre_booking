package com.fita_spring_boot_l1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fita_spring_boot_l1.Repository.MovieListRepo;
import com.fita_spring_boot_l1.Repository.TheatreRepo;
import com.fita_spring_boot_l1.Services.TheatreService;
import com.fita_spring_boot_l1.model.MovieList;
@Service
public class TheatreServiceImpl implements TheatreService{

	@Autowired
	TheatreRepo theatreRepo;
	@Autowired
	MovieListRepo movieListRepo;

	@Override
	public List<MovieList> getAllTheatresByName(String name) {
		System.out.println("-- from theatre "+name);
		List<MovieList> test =  movieListRepo.findByMovieName(name);
		System.out.println("-- from theatre "+test.size());
		return movieListRepo.findByMovieName(name);
	}

	

}
