package com.changi.record_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changi.record_project.dto.UserDTO;


@RestController
@RequestMapping("/user")
public class LoginRestController {
	
	@GetMapping("/login")
	public int login(UserDTO userDTO) {
		
		System.out.println(userDTO.toString());
		return 0; 
	}
}
