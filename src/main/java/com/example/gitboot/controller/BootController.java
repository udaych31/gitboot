package com.example.gitboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class BootController {

	@GetMapping("/get")
	public String getMessage() {
		return "welcome to git boot";
				
	}
	
}
