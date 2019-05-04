package com.example.gitboot.dto;

import java.io.Serializable;

public class GitRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String gitName;
	
	private String author;
	
	private String repoName;
	
	public GitRequest() {
	}

	public String getGitName() {
		return gitName;
	}

	public void setGitName(String gitName) {
		this.gitName = gitName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	@Override
	public String toString() {
		return "GitRequest [gitName=" + gitName + ", author=" + author + ", repoName=" + repoName + "]";
	}
	
	

}
