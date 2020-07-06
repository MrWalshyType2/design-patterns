package com.qa.vehicle_factory;

public class VehicleFactory {
	public Vehicle getVehicle(String type) {
		if (type == null) {
			return null;
		}

		if (type.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if (type.equalsIgnoreCase("BOAT")) {
			return new Boat();
		}

		return null;
	}
}
