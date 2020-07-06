package com.qa.vehicle_factory;

public class App {
	public static void main(String args[]) {
		VehicleFactory vf = new VehicleFactory();

		Vehicle brumBrumCar = vf.getVehicle("car");
		brumBrumCar.type();
		brumBrumCar.drive();

		Vehicle boatyMcBoatFace = vf.getVehicle("boat");
		boatyMcBoatFace.type();
		boatyMcBoatFace.drive();
	}
}
