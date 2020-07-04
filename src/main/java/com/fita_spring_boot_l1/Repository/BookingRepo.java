package com.fita_spring_boot_l1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fita_spring_boot_l1.model.User;

public interface BookingRepo extends JpaRepository<User, Long>{
//select
	//find
	//update
	//save
}
