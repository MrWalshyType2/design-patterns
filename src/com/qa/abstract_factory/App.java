package com.qa.abstract_factory;

public class App {
	public static void main(String args[]) {
		// Create normal shape factory and rounded shape factory
		AbstractFactory normFactory = FactoryGenerator.getFactory(false);
		AbstractFactory roundedFactory = FactoryGenerator.getFactory(true);

		// Create a square from each factory and call their draw methods
		Shape normSquare = normFactory.getShape("square");
		Shape roundedSquare = roundedFactory.getShape("square");
		normSquare.draw();
		roundedSquare.draw();
	}
}
