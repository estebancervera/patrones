package com.mayab.desarollo.parcial1.problema2;

public class Descuento extends Producto {

private Producto producto;
private Double descuento;
	
	public Descuento(Producto producto, Double descuento) {
		super();
		this.producto = producto;
		this.descuento = descuento;
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return producto.calcularPrecioFinal() - (producto.getPrecioBase() * descuento) ;
	}

	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return producto.getPrecioBase();
	}

}
