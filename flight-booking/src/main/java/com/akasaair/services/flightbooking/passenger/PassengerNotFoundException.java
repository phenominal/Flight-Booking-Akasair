package com.akasaair.services.flightbooking.passenger;

import com.akasaair.services.flightbooking.system.ResourceNotFoundException;

public class PassengerNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = -7428665705397767944L;

	public PassengerNotFoundException(String passengerId) {
		super("Passenger", "passenger-id", passengerId);
	}

}
