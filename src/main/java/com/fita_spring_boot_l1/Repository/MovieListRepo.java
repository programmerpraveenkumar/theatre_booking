package com.fita_spring_boot_l1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fita_spring_boot_l1.model.MovieList;
import com.fita_spring_boot_l1.model.Theatre;

@Repository
public interface MovieListRepo extends JpaRepository<MovieList, Long>{
//select
	//find
	//update
	//save
	
	@Query("Select movieList from MovieList movieList where movieList.name=:movie_name")
	List<MovieList>findByMovieName(@Param("movie_name")String movie_name);
}
