package com.mayab.desarollo.patrones.dependency;

public class Empleado {
	private String nombre;
	private String tipo;
	
	public Empleado(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
	
}
