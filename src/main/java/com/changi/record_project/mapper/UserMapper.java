package com.changi.record_project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.changi.record_project.dto.UserDTO;
import com.changi.record_project.entity.User;

@Mapper
public interface UserMapper {
	
	User loginUser(@Param("userId") String userId,@Param("userPassword")  String userPassword);

	User duplicateIdCheck(@Param("userId") String userId);

	void insertUser(@Param("userId") String userId, @Param("userPassword") String userPassword);

}
