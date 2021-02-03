package com.mayab.desarollo.patrones.estructura.decorator;

public class TextFile extends File{

	
	public String read() {
		return "Estoy leyendo datos";
	}
	
	public String write() {
		return "Estoy escribiendo datos";
	}
	
}
