package com.csust.tea.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/order")
	public String quiz() {
		return "order.html";
	}
	
	@GetMapping("/manage")
	public String question() {
		return "manage.html";
	}
	@GetMapping("/statistics")
	public String answer() {
		return "statistics.html";
	}
	@GetMapping("/login")
	public String login() {
		return "login.html";
	}
}
