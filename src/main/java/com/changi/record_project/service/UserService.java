package com.changi.record_project.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changi.record_project.dto.UserDTO;
import com.changi.record_project.entity.User;
import com.changi.record_project.mapper.UserMapper;

import jakarta.servlet.http.HttpSession;
 

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	public int loginUser(String userId, String userPassword, HttpSession session) {
		User user = userMapper.loginUser(userId,userPassword);
		if( user != null) {
			session.setAttribute("user", user);
			return 1; 
		}else {
			return 0;
		}
	}

	public boolean duplicateIdCheck(String userId) {
		User user = userMapper.duplicateIdCheck(userId);
		if( user != null) {
			return false;
		}else {
			return true;
		}
	}

	public void insertUser(String userId, String userPassword) {
		userMapper.insertUser(userId,userPassword);
	}



}
