package com.changi.record_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import ch.qos.logback.core.model.Model;

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
	public String timeLine(Model model) {
		return "timeLine";
	}
}
