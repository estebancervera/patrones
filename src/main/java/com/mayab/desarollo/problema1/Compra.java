package com.mayab.desarollo.problema1;

public class Compra {
	private Double costo;
	private String producto;
	
	
	public Compra(Double costo, String producto) {
		super();
		this.costo = costo;
		this.producto = producto;
	}


	@Override
	public String toString() {
		return "Compra [costo=" + costo + ", producto=" + producto + "]";
	}


	public Double getCosto() {
		return costo;
	}


	public String getProducto() {
		return producto;
	};
	
	
	
}
