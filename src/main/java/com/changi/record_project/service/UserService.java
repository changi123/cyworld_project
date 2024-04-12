package com.changi.record_project.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changi.record_project.dto.UserDTO;
import com.changi.record_project.entity.User;
import com.changi.record_project.mapper.UserMapper;
 

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	public int loginUser(String userId, String userPassword) {
		User user = userMapper.loginUser(userId,userPassword);
		if( user != null) {
			return 1; 
		}else {
			return 0;
		}
	}



}
