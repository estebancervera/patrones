package com.mayab.desarollo.patrones.comportamiento.observer;

import com.mayab.desarollo.patrones.comportamiento.observer.Flight.Status;

public class FlightDisplay implements Observer,React{

	private String time;
	private Status status;
	private String day;
	private String gate;
	private Flight flight;
	
	public FlightDisplay(Flight f) {
		flight = f;
		f.registerObserver(this);
	}
	
	@Override
	public void update(String time, Status status, String day, String gate) {
		// TODO Auto-generated method stub
		this.time = time;
		this.status = status;
		this.day = day;
		this.gate = gate;
		doSomething();
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("FLIGHT--|TIME: " + time + "|DAY: "+ day + "|GATE: " + gate + "|STATUS: " + status.toString() );
	}

}
