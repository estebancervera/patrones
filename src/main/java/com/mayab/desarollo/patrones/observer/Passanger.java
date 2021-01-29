package com.mayab.desarollo.patrones.observer;

import com.mayab.desarollo.patrones.observer.Flight.Status;

public class Passanger implements Observer,React{

	private String time;
	private Status status;
	private String gate;
	private Flight flight;
	
	public Passanger(Flight f) {
		this.flight = f;
		f.registerObserver(this);
	}
	
	@Override
	public void update(String time, Status status, String day, String gate) {
		// TODO Auto-generated method stub
		this.time = time;
		this.status = status;
		this.gate = gate;
		doSomething();
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		if(status == Status.INTIME) {
			System.out.println("The passanger is waiting for the flight! at gate: " + this.gate + " at time: " + this.time);
		}else if(status == Status.DELAYED) {
			System.out.println("The passanger go to eat something. The flight is at gate: " + this.gate + "at time: " + this.time);
		}else if(status == Status.CANCELLED) {
			System.out.println("The passanger goes back to their hotel.");
		}else {
			System.out.println("ERROR");
		}
	}

}
