package com.mayab.desarollo.patrones.estructura.decorator;

public class Compress extends Decorator{

	private File file;
	
	
	public Compress(File file) {
		this.file = file;
	}

	@Override
	public String write() {
		return "comprimiendo datos + " + file.write();
		// TODO Auto-generated method stub
		
	}

	@Override
	public String read() {
		return "descomprimiendo datos + " + file.read();
		// TODO Auto-generated method stub
		
	}

}
