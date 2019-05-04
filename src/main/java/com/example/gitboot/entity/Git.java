package com.example.gitboot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Git implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer gitId;
	
	@Column
	private String gitName;
	
	@Column
	private String author;
	
	@Column
	private String repoName;
	
	@Column
	private String creatDt;
	
	public Git() {
	}

	public Integer getGitId() {
		return gitId;
	}

	public void setGitId(Integer gitId) {
		this.gitId = gitId;
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

	public String getCreatDt() {
		return creatDt;
	}

	public void setCreatDt(String creatDt) {
		this.creatDt=creatDt;
	}
	
	@Override
	public String toString() {
		return "Git [gitId=" + gitId + ", gitName=" + gitName + ", author=" + author + ", repoName=" + repoName
				+ ", creatDt=" + creatDt + "]";
	}


	
}
