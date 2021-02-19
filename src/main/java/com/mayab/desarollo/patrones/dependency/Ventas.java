package com.mayab.desarollo.patrones.dependency;

public class Ventas {
	private String producto;
	private int precio;
	private Empleado e;
	
	public Ventas(String producto, int precio, Empleado e) {
		super();
		this.producto = producto;
		this.precio = precio;
		this.e = e;
	}

	public String getProducto() {
		return producto;
	}

	public int getPrecio() {
		return precio;
	}

	public Empleado getE() {
		return e;
	}

	@Override
	public String toString() {
		return "Ventas [producto=" + producto + ", precio=" + precio + ", e=" + e.getNombre() + "]";
	}
	
	
	
	
}
