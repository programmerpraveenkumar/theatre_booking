package com.fita_spring_boot_l1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "movie_list")
public class MovieList {
	@Id//mandatory
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String date_from;
	String date_to;
	Long theatre_id;
	
	Integer total_seats;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(Integer total_seats) {
		this.total_seats = total_seats;
	}
	public Long getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(Long theatre_id) {
		this.theatre_id = theatre_id;
	}
	
	public String getDate_to() {
		return date_to;
	}
	public void setDate_to(String date_to) {
		this.date_to = date_to;
	}
	public String getDate_from() {
		return date_from;
	}
	public void setDate_from(String date_from) {
		this.date_from = date_from;
	}
	
}
