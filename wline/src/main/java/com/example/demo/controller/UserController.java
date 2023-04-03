package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/showDetails")
	public List<UserModel> showUserDetails() {
		return userService.getDetails();
	}
	
	@PostMapping("/saveDetails")
	public String saveDetails(@RequestBody UserModel userDetails) {
		
		if(userService.saveDetails(userDetails)) {
			return "saved successfully...";
		}
		return "problem occurred try again...";
	}
}
