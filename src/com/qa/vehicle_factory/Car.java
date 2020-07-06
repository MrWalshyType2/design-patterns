package com.qa.vehicle_factory;

public class Car implements Vehicle {

	Car() {

	}

	@Override
	public void type() {
		System.out.println("I am a car, brum brum!");
	}

	@Override
	public void drive() {
		System.out.println("Firing on all cylinders!");
	}

}
