package com.spr;
public class Student {
	private int roll;
	private String name;
	private String city;
	
//	default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	print karne ke liye toString() method bna diya h
// object ko jayese hmm print karte h app.java me toh by default yehi method call hota h or print hota h
@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}

	//	parametrized constructor
	public Student(int roll,String name,String city) {
		super();
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	
}
