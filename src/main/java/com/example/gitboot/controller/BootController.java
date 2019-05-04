package com.example.gitboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gitboot.service.BootServiceImpl;

@RestController
@RequestMapping("/boot")
public class BootController {
	
	private BootServiceImpl bootServiceImpl;

	@GetMapping("/get")
	public String getMessage() {
		return "welcome to git boot";
				
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi hello";
	}
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return bootServiceImpl.add(a, b);
	}
	
	@GetMapping("/div/{a}/{b}")
	public int div(@PathVariable int a,@PathVariable int b) {
		return bootServiceImpl.add(a, b);
	}
	
	@GetMapping("/say")
	public String say() {
		return "welcome to git boot";
	}
	
}
