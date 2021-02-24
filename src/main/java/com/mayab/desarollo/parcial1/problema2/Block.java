package com.mayab.desarollo.parcial1.problema2;

public class Block extends Producto {

	//private String nombre
	private Double precioBase;
	
	
	
	public Block(Double precioBase) {
		super();
		this.precioBase = precioBase;
	}


	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return precioBase;
	}


	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return precioBase;
	}
	
	 

}
