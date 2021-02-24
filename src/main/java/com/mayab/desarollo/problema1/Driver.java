package com.mayab.desarollo.problema1;

public class Driver {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente("Esteban"); // subscrito a los dos tipos de mensaje
		Gerente g2 = new Gerente("Andoni"); //subscrito a solo mensajes de email
		Gerente g3 = new Gerente("Luis"); //subscrito a los dos pero se desuscribe de los mensajes de Texto despues del primer mensaje de Texto
		SingletonRegistroCompras.getInstance().removeObserverText(g2); //quita al gerente de la lista de observers para mensajes de texto
		
		//Compras con costo mayor a 200 enviaran mensaje
		Compra c1 = new Compra(201.0, "Alimentos");
		Compra c2 = new Compra(199.0, "Materiales Oficina");
		Compra c3 = new Compra(500.0, "Materiales Construccion");
		
		SingletonRegistroCompras.getInstance().addCompra(c1); //Mensaje enviado
		
		SingletonRegistroCompras.getInstance().removeObserverText(g3); //quita al gerente de la lista de observers para mensajes de texto
		
		SingletonRegistroCompras.getInstance().addCompra(c2); //Mensaje no enviado
		SingletonRegistroCompras.getInstance().addCompra(c3); // Mensaje enviado
		
		g1.showMessages(); // debe tener 2 mensajes de email y 2 de Texto
		
		System.out.println("\n\n");
		
		g2.showMessages();
		
		System.out.println("\n\n");
		
		g3.showMessages();
		
		System.out.println("\n\n\n");
		
		SingletonLogMensajes.getInstance().showLogs();
		
		
	}

}
