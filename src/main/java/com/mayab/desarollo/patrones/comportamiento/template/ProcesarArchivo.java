package com.mayab.desarollo.patrones.comportamiento.template;

public abstract class ProcesarArchivo {

	final void procesar() {
		validar();
		abrir();
		leer();
		escribirDB();
	}
	public abstract void validar();
	void abrir() {
		System.out.println("Abriendo el archivo");
	}	
	abstract void leer();
	void escribirDB() {
		System.out.println("Escribiendo en la base de datos");
	}
}
