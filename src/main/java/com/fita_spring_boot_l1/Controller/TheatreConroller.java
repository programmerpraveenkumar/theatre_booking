package com.fita_spring_boot_l1.Controller;

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
		
		List<MovieList> test =  theatreService.getAllTheatresByName(name);
		
		return ResponseEntity.ok(test);
		
		
	}
}
