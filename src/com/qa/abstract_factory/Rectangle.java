package com.qa.abstract_factory;

public class Rectangle implements Shape {
	// Concrete classes implement the same interface

	@Override
	public void draw() {
		System.out.println("Rectangle draw() method");
	}

	public void drawRect() {
		System.out.println("Rectangle");
	}
}
