package com.qa.abstract_factory;

public class FactoryGenerator {

	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
