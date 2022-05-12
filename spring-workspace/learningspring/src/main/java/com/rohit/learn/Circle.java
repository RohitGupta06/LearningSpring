package com.rohit.learn;

public class Circle implements Shape {
	
	private float radius;
	
	// Getter Method
	public float getRadius() {
		return radius;
	}
	
	// Setter Method
	// Used for Setter Injection with spring
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle of radius = " + getRadius() + "units");
	}
}
