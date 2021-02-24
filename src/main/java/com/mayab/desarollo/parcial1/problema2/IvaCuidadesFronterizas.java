package com.mayab.desarollo.parcial1.problema2;

public class IvaCuidadesFronterizas extends Decorator {

private Producto producto;
	
	
	
	public IvaCuidadesFronterizas(Producto producto) {
		super();
		this.producto = producto;
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return producto.calcularPrecioFinal() + (producto.getPrecioBase() * 0.08) ;
	}

	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return producto.getPrecioBase();
	}


}
