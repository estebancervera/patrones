package com.mayab.desarollo.patrones.comportamiento.observer;

import com.mayab.desarollo.patrones.comportamiento.observer.Flight.Status;

public interface Observer {
	void update(String time, Status status, String day, String gate);
}
