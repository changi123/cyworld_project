package com.changi.record_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.changi.record_project.entity.User;

import jakarta.servlet.http.HttpSession;



@Controller
public class WebController {
	@GetMapping("/")
	public String hello(Model model) {
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}
	@GetMapping("/timeLine")
	public String timeLine(Model model,HttpSession session) {
		model.addAttribute("user", (User) session.getAttribute("user"));
		return "timeLine";
	}
	@GetMapping("/logout")
	public String logout(Model model,HttpSession session) {
		session.invalidate();
		return "index";
	}
}
