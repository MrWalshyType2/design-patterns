package com.qa.abstract_factory;

public abstract class AbstractFactory {
	// For creating any type of Shape object (squared or rounded)
	public abstract Shape getShape(String shapeType);
}
