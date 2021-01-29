package com.mayab.desarollo.patrones.observer;

import com.mayab.desarollo.patrones.observer.Flight.Status;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight = new Flight();
		
		Passanger pass = new Passanger(flight);
		Crew crew = new Crew(flight);
		FlightDisplay fd = new FlightDisplay(flight);
		
		flight.setFlight("6:00 AM", Status.INTIME, "28/1/2021", "A3");
		
	}

}
