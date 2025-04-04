package com.blurdel.ssc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome Public</h1>");
	}

	
	@GetMapping("/admin") // Any authenticated user/any authority
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
	
}
