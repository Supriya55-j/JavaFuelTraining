package com.example.demospringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String home()
	{
		//String s1="<h1>hello world</h1>";
		return "<h1>hello world</h1>";
		
	}
}
