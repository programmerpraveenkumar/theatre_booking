package com.fita_spring_boot_l1.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fita_spring_boot_l1.model.MovieList;

@Repository
public interface MovieListRepo extends JpaRepository<MovieList, Long>{
//select
	//find
	//update
	//save
	
	@Query("Select movieList from MovieList movieList where movieList.name=:movie_name")
	List<MovieList>findByMovieName(@Param("movie_name")String movie_name);
	@Query("Select movieList from MovieList movieList where movieList.theatre_id=:theatre_id")
	List<MovieList> getRunningShowsByTheatreId(@Param("theatre_id")Long theatre_id);
	@Query("Select movieList from MovieList movieList where movieList.date_from >= :startTime and movieList.date_to <= :endTime ")
	List<MovieList> getRunningShowsByTiming(@Param("startTime")Date startTime,@Param("endTime")Date endTime);
//	@Query("Select movieList from MovieList movieList where movieList.date_from >= :startTime")
//	List<MovieList> getRunningShowsByTiming2(@Param("startTime")Date startTime);
//	@Query("Select movieList from MovieList movieList where movieList.date_to <= :endTime")
//	List<MovieList> getRunningShowsByTiming3(@Param("endTime")Date endTime);
	
	
}
