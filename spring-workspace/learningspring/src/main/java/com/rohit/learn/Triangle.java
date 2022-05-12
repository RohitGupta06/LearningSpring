package com.rohit.learn;

public class Triangle implements Shape {
	
	private String type;
	private float height;
	
	public Triangle() {
		this.type = "Scalene";
		this.height = 5;
	}

	// Parameterized Constructor
	// Used for Constructor Injection with spring
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(float height) {
		this.height = height;
	}
	
	public Triangle(String type, float height) {
		this.type = type;
		this.height = height;
	}

	// Getter Methods
	public String getType() {
		return type;
	}
	
	public float getHeight() {
		return height;
	}
	
	// Setter Method
	// Used for Setter Injection with spring
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing " + getType() + " Triangle of height = " + getHeight() + "units");
	}
}
