package com.example.gitboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gitboot.service.CalcServiceImpl;

@RestController
@RequestMapping("/git")
public class GitController {
	
	@Autowired
	private CalcServiceImpl calcServiceImpl;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to git";
	}
	
	@GetMapping("/addition")
	public String addition() {
		return "git addition";
	}
	
	@GetMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a,@PathVariable int b) {
		return calcServiceImpl.sub(a, b);
	}
	
	@GetMapping("/mul/{a}/{b}")
	public int mul(@PathVariable int a,@PathVariable int b) {
		return calcServiceImpl.mul(a, b);
	}
	
	@GetMapping("/addition/{a}/{b}")
	public int addition(@PathVariable int a,@PathVariable int b) {
		return calcServiceImpl.addition(a, b);
	}

}
