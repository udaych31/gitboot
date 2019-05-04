package com.example.gitboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
}
