package com.example.gitboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to git";
	}

}
