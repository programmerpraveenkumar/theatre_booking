package com.fita_spring_boot_l1.ServiceImpl;

import java.text.SimpleDateFormat;
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
	public List<MovieList> getAllTheatresByMovieName(String name) {
		return movieListRepo.findByMovieName(name);
	}

	@Override
	public List<MovieList> getRunningShowsByTheatreId(long id) {
		return movieListRepo.getRunningShowsByTheatreId(id);
	}

	@Override
	public List<MovieList> getRunningShowsByTiming(String from_time, String to_time) {
		// TODO Auto-generated method stub
		//
		
		try {
			String tot_time = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(to_time).toString();
			String fromt_time = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(from_time).toString();
			
			System.out.println(tot_time+" "+fromt_time);
			System.out.println(tot_time+" ---"+fromt_time);
			return movieListRepo.getRunningShowsByTiming(from_time,to_time);
//			return movieListRepo.getRunningShowsByTiming2(
//					new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(from_time)
//					
//					);
			//java.sql.Date sqlStartDate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(tot_time));
			//return movieListRepo.getRunningShowsByTiming3(to_time);
			
		}catch(Exception e) {
			
		}
		
		return null;
	}

	

}
