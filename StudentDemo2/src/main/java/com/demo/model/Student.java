package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{

	@Id
	private int sid;
	private String sname;
	private double spercent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, double spercent) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.spercent = spercent;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSpercent() {
		return spercent;
	}
	public void setSpercent(double spercent) {
		this.spercent = spercent;
	}
	
	
	
}