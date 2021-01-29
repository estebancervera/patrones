package com.mayab.desarollo.patrones.observer;

import com.mayab.desarollo.patrones.observer.Flight.Status;

public interface Observer {
	void update(String time, Status status, String day, String gate);
}
