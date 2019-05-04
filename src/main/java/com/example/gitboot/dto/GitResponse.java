package com.example.gitboot.dto;

import java.io.Serializable;

public class GitResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String message;
	
	public GitResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "GitResponse [message=" + message + "]";
	}
	
	

}
