package com.mayab.desarollo.parcial1.problema1;

import java.util.ArrayList;

import com.mayab.desarollo.parcial1.problema1.Message.MessageType;


/*
 * Decidi volver el registro de compras un singleton, ya que es importante que no se creen otras instancias de este objeto
 * y que este sea accesible en todas las clases como la del Gerente.
 * 
 * Lo vi del punto de vista de una sola empresa con un solo registro de ventas 
 * Si fue necesario la creacion de multiples instancias del registro de ventas solo quitarle el singleton a esta clase y modificar
 * los observers para tomar la instancia de esta clase como parametro en el constructor.
 * 
 * 
 */

public class SingletonRegistroCompras implements Subject {
	
	private ArrayList<Observer> observersEmail = new ArrayList<Observer>();
	private ArrayList<Observer> observersText = new ArrayList<Observer>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	
	private static SingletonRegistroCompras instance;

	public SingletonRegistroCompras() {
		super();
	}
	
	public static SingletonRegistroCompras getInstance() {
		if(instance == null)
			instance = new SingletonRegistroCompras();
		return instance;
	}

	@Override
	public void registerObserverEmail(Observer ob) {
		// TODO Auto-generated method stub
		this.observersEmail.add(ob);
	}

	@Override
	public void removeObserverEmail(Observer ob) {
		// TODO Auto-generated method stub
		this.observersEmail.remove(ob);
	}

	@Override
	public void registerObserverText(Observer ob) {
		// TODO Auto-generated method stub
		this.observersText.add(ob);
	}

	@Override
	public void removeObserverText(Observer ob) {
		// TODO Auto-generated method stub
		this.observersText.remove(ob);
	}

	private void notifyEmailObservers(Compra c) {
		Message m = new Message(MessageType.EMAIL,c);
		SingletonLogMensajes.getInstance().addMessage(m); // agrega el mensaje al historial
		
		for(Observer ob: observersEmail) {
			ob.getMessage(m);
			//System.out.println(m.getType().name());
		}
	}
	
	private void notifyTextObservers(Compra c) {
		Message m = new Message(MessageType.TEXT,c);
		SingletonLogMensajes.getInstance().addMessage(m); // agrega el mensaje al historial
		
		for(Observer ob: observersText) {
			ob.getMessage(m);
			//System.out.println(m.getType().name());
		}
	}

	@Override
	public void sendMessages(Compra c) {
		// TODO Auto-generated method stub
		//crear mensaje  basado en compa
		
		notifyTextObservers(c);
		notifyEmailObservers(c);
		
	}
	
	public void addCompra(Compra c) {
		compras.add(c);
		if(c.getCosto() > 200) {
			sendMessages(c);
		}
	}


}
