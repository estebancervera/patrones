package com.mayab.desarollo.parcial1.problema1;

public interface Subject {
	void registerObserverEmail(Observer ob);
	void removeObserverEmail(Observer ob);
	void registerObserverText(Observer ob);
	void removeObserverText(Observer ob);
	
	void sendMessages(Compra c);
}
