package com.qa.vehicle_factory;

public class Boat implements Vehicle {

	Boat() {

	}

	@Override
	public void type() {
		System.out.println("I am a boat... SWIM SWIM SWIM!");
	}

	@Override
	public void drive() {
		System.out.println("Engaging the fans...");
	}

}
