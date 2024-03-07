package com.example.abbs.entity;

import java.time.LocalDate;

public class User {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate reDAte;
	private int isDeleted;
	private String prodfile;
	private String github;
	private String insta;
	private String location;
	
	public User() { }
	public User(String uid, String pwd, String uname, String email, LocalDate reDAte, int isDeleted, String prodfile,
			String github, String insta, String location) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.reDAte = reDAte;
		this.isDeleted = isDeleted;
		this.prodfile = prodfile;
		this.github = github;
		this.insta = insta;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", pwd=" + pwd + ", uname=" + uname + ", email=" + email + ", reDAte=" + reDAte
				+ ", isDeleted=" + isDeleted + ", prodfile=" + prodfile + ", github=" + github + ", insta=" + insta
		
				+ ", location=" + location + "]";
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getReDAte() {
		return reDAte;
	}
	
	public void setReDAte(LocalDate reDAte) {
		this.reDAte = reDAte;
	}
	
	public int getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public String getProdfile() {
		return prodfile;
	}
	
	public void setProdfile(String prodfile) {
		this.prodfile = prodfile;
	}
	
	public String getGithub() {
		return github;
	}
	
	public void setGithub(String github) {
		this.github = github;
	}
	
	public String getInsta() {
		return insta;
	}
	
	public void setInsta(String insta) {
		this.insta = insta;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

}
