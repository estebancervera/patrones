package com.mayab.desarollo.parcial1.problema1;

import java.util.ArrayList;

public class Gerente implements Observer {

	private ArrayList<Message> messages;
	private String name;
	
	public Gerente(String name) {
		super();
		messages = new ArrayList<Message>();
		this.name = name;
		SingletonRegistroCompras.getInstance().registerObserverEmail(this);
		SingletonRegistroCompras.getInstance().registerObserverText(this);
	}



	@Override
	public void getMessage(Message message) {
		// TODO Auto-generated method stub
		//System.out.println(message);
		messages.add(message);
		//messages.toString();
	}
	
	public void showMessages() {
		
		System.out.println("======== MENSAJES DE " + name.toUpperCase() + "============");
		for(Message m: messages) {
			System.out.println("	----MENSAJE TIPO " + m.getType().name() + " ----");
			//System.out.println("  	--COMPRA COSTO ALTO--");
			System.out.println("	COMPRA DE : " + m.getCompra().getProducto());
			System.out.println("	COSTO: " + m.getCompra().getCosto());
			System.out.println("--------------------------");
		}
		System.out.println("=====================================");
	}

}
