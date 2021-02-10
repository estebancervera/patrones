package com.mayab.desarollo.patrones.estructura.proxy;

public class Empleado {
	private String tipo;
	private Reporte reporte;
	
	
	public Empleado(String tipo) {
		super();
		this.tipo = tipo;
		this.reporte = new ReporteVentasProxy(this);
	}

	public String getTipo() {
		return tipo;
	}

	public Reporte getReporte() {
		return reporte;
	}

	
	public void escribirReporte(String contenido) {
		reporte.escribir(contenido);
	}
	
	public void leerReporte() {
		reporte.leer();
	}
	
	
	
	
	
}
