package com.fita_spring_boot_l1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fita_spring_boot_l1.Services.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService userService;
	@GetMapping("user")
	public ResponseEntity<?> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUser());
	}
}
