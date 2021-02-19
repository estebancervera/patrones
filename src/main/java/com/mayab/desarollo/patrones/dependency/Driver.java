package com.mayab.desarollo.patrones.dependency;

public class Driver {
	public static void main(String[] args) {
		Empleado v1 = new Empleado("Esteban", "admin");
		Empleado v2 = new Empleado("Andoni", "empleado");
		IServicioDatos servicio = new ServiciosDatosVentas();
		
		ReporteVentasProxy proxy = new ReporteVentasProxy(v2, servicio);
		
		Ventas ven1 = new Ventas("pizza", 15, v1);
		Ventas ven2 = new Ventas("donas", 20, v2);
		Ventas ven3 = new Ventas("helado", 30, v2);
		servicio.addVenta(ven1);
		servicio.addVenta(ven2);
		servicio.addVenta(ven3);
		
		proxy.imprimir();
		
		System.out.println("----ADMIN----");
		
		proxy = new ReporteVentasProxy(v1, servicio);
		
		proxy.imprimir();
		
		
		
		
	}
}
