package com.akasaair.services.flightbooking.passenger;

import java.util.List;

import com.akasaair.services.flightbooking.domain.entity.Passenger;

public interface PassengerService {
	
	Passenger getPassengerById(String passengerId);

	List<Passenger> getAllPassengers();
}
