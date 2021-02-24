package com.mayab.desarollo.patrones.comportamiento.observer;

import com.mayab.desarollo.patrones.comportamiento.observer.Flight.Status;

public class Crew implements Observer,React{
	
	private Status status;
	private String gate;
	private Flight flight;
	
	public Crew(Flight f) {
		flight = f;
		f.registerObserver(this);
	}

	@Override
	public void update(String time, Status status, String day, String gate) {
		// TODO Auto-generated method stub
		this.status = status;
		this.gate = gate;
		doSomething();
		
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		if(status == Status.INTIME) {
			System.out.println("The crew gets ready for the flight! at gate: " + this.gate);
		}else if(status == Status.DELAYED) {
			System.out.println("The crew go to eat something. The flight is at gate: " + this.gate);
		}else if(status == Status.CANCELLED) {
			System.out.println("The crew go back to their hotel.");
		}else {
			System.out.println("ERROR");
		}
		
	}

}
