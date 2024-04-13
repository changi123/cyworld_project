package com.changi.record_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changi.record_project.dto.UserDTO;
import com.changi.record_project.entity.User;
import com.changi.record_project.service.UserService;

import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/login")
	public int login(UserDTO userDTO,HttpSession session) {
		return userService.loginUser(userDTO.getUserId(),userDTO.getUserPassword(),session); 
	}
	@PostMapping("/register")
	public int register(UserDTO userDTO) {
		
		boolean duplicateIdCheck = userService.duplicateIdCheck(userDTO.getUserId());
		if( duplicateIdCheck ) {
			userService.insertUser(userDTO.getUserId(),userDTO.getUserPassword());
			return 1;
		}else {
			return 0 ;
		}
	}
}
