package com.fita_spring_boot_l1.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fita_spring_boot_l1.Services.TheatreService;
import com.fita_spring_boot_l1.model.MovieList;

@RestController
@RequestMapping("theatre")
public class TheatreConroller {

	@Autowired
	TheatreService theatreService;
	
	@PostMapping("getByMovie")
	public ResponseEntity<?> getAllTheatreByMovie(@RequestBody String name){
		List<MovieList> test =  theatreService.getAllTheatresByMovieName(name);
		return ResponseEntity.ok(test);
	}
	
	@PostMapping("getRunningShowsByTheatreId")
	public ResponseEntity<?> getRunningShowsByTheatreId(@RequestBody String theatreId){
		List<MovieList> test =  theatreService.getRunningShowsByTheatreId(Long.parseLong(theatreId));
		return ResponseEntity.ok(test);
	}
	@PostMapping("getRunningShowsByTiming")
	public ResponseEntity<?> getRunningShowsByTiming(@RequestBody HashMap<String,String> obj){
		List<MovieList> test =  theatreService.getRunningShowsByTiming(obj.get("start_time"),obj.get("end_time")); 
		return ResponseEntity.ok(test);
	}
	
	/**
	 * 1.get movies list by theater id
	 * 		1.theatre_id
	 * 		2.service->
	 */
}
