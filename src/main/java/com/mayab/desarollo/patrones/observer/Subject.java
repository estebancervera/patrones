package com.mayab.desarollo.patrones.observer;

public interface Subject {
	void registerObserver(Observer ob);
	void removeObserver(Observer ob);
	void notifyObservers();
}
