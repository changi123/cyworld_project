package com.changi.cyworld_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
	@GetMapping("/")
	public String hello(Model model) {
		return "index";
	}

	@GetMapping("/test")
	public String hello2(Model model) {
		return "test";
	}
}
