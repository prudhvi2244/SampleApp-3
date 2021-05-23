package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String homePage()
	{
		return "<h1 style='color:red;text-align:center'>Welcome To SampleApp-3</h1>";
	}
	
}
