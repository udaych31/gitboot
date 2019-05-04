package com.example.gitboot.service;

public class BootServiceImpl implements BootService {

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int div(int a, int b) {
		return a/b;
	}

}
