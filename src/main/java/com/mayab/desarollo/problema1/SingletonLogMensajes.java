package com.mayab.desarollo.problema1;

import java.util.ArrayList;

public class SingletonLogMensajes {
	
	private static SingletonLogMensajes instance;
	
	private ArrayList<Message> log = new ArrayList<Message>();
	
	public SingletonLogMensajes() {
		super();
	}
	
	public static SingletonLogMensajes getInstance() {
		if(instance == null)
			instance = new SingletonLogMensajes();
		return instance;
	}
	
	public void addMessage(Message m) {
		log.add(m);
	}
	public void showLogs() {
			System.out.println("======== HISTORIAL DE MENSAJES ============");
		for(Message m: log) {
			System.out.println("|	----MENSAJE TIPO " + m.getType().name() + " ----");
			System.out.println("|	COMPRA DE : " + m.getCompra().getProducto() );
			System.out.println("|	COSTO: " + m.getCompra().getCosto());
			System.out.println("|---------------------------------");
		}
			System.out.println("=====================================");
	}
	
}
