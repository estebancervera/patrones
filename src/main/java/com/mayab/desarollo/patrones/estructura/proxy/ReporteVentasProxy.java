package com.mayab.desarollo.patrones.estructura.proxy;

public class ReporteVentasProxy implements Reporte {
	
	private ReporteVentas reporteVentas;
	
	private Empleado empleado;
	
	public ReporteVentasProxy(Empleado empleado) {
		super();
		reporteVentas = new ReporteVentas();
		this.empleado = empleado;
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		reporteVentas.leer();
	}

	@Override
	public void escribir(String contenido) {
		// TODO Auto-generated method stub
			if(empleado.getTipo() == "admin") {
				reporteVentas.escribir(contenido);
			}else {
				System.out.println("No tienes permiso para escribir en el archivo");
			}
	}

}
