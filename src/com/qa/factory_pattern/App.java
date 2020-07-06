package com.qa.factory_pattern;

public class App {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();

		// Get circle obj and call draw
		Shape c1 = sf.getShape("circle");
		c1.draw();

		// Get square obj and call draw
		Shape s1 = sf.getShape("square");
		s1.draw();

		// Get rectangle obj and call draw
		Shape r1 = sf.getShape("rectangle");
		System.out.println(r1 instanceof Rectangle);
	}
}
