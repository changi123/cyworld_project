package com.changi.record_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changi.record_project.dto.UserDTO;
import com.changi.record_project.service.UserService;


@RestController
@RequestMapping("/user")
public class LoginRestController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/login")
	public int login(UserDTO userDTO) {
		return userService.loginUser(userDTO.getUserId(),userDTO.getUserPassword()); 
	}
}
