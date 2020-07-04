package com.fita_spring_boot_l1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fita_spring_boot_l1.Repository.UserRepo;
import com.fita_spring_boot_l1.Services.UserService;
import com.fita_spring_boot_l1.model.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

}
