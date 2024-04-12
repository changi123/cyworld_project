package com.changi.record_project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private String userId ;
	private String userPassword;
	private String userEmail;
	
	
	
}
