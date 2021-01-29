package com.mayab.desarollo.patrones.observer;

import java.util.ArrayList;

public class Flight implements Subject{
	
	enum Status{
		INTIME,
		DELAYED,
		CANCELLED
	}
	
	private String time;
	private Status status;
	private String day;
	private String gate;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);
		}

	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.remove(ob);
	}

	public void flightChanged() {
		notifyObservers();
	}
	
	public void setFlight(String time, Status status, String day,String gate) {
		this.time = time;
		this.status = status;
		this.day = day;
		this.gate = gate;
		flightChanged();
	}
	
	public String getTime() {
		return time;
	}

	public Status getStatus() {
		return status;
	}

	public String getDay() {
		return day;
	}

	public String getGate() {
		return gate;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer: observers) {
			observer.update(time,status,day,gate);
		}
	}

}
