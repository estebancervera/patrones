package com.mayab.desarollo.parcial1.problema2;

public class IvaRumorado extends Decorator {

	private Producto producto;
	
	public IvaRumorado(Producto producto) {
		super();
		this.producto = producto;
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return producto.calcularPrecioFinal() + (producto.getPrecioBase() * 0.02) ;
	}

	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return producto.getPrecioBase();
	}


}
