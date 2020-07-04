package com.fita_spring_boot_l1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	Long id;
	String user_id;
	String theatre_id;
	@Column(insertable=false,updatable=false)
	String booking_time;
	double price;
	String paymeny_type;
	String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(String theatre_id) {
		this.theatre_id = theatre_id;
	}
	public String getBooking_time() {
		return booking_time;
	}
	public void setBooking_time(String booking_time) {
		this.booking_time = booking_time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPaymeny_type() {
		return paymeny_type;
	}
	public void setPaymeny_type(String paymeny_type) {
		this.paymeny_type = paymeny_type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
