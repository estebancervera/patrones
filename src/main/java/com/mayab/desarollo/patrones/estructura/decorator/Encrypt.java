package com.mayab.desarollo.patrones.estructura.decorator;

public class Encrypt extends Decorator{

	
	private File file;
	
	
	public Encrypt(File file) {
		this.file = file;
	}
	
	@Override
	public String write() {
		return  "encriptando datos + " + file.write() ;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String read() {
		return "desencriptando datos + " + file.read();
		// TODO Auto-generated method stub
		
	}

}
