package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<UserModel> getDetails(){
		
		return userRepository.findAll();
	}
	public boolean saveDetails(UserModel userDetails) {
		try {
			userRepository.save(userDetails);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
