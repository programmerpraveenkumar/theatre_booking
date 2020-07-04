package com.fita_spring_boot_l1.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fita_spring_boot_l1.model.User;

@Service
public interface UserService {
	List<User> getAllUser();
}
