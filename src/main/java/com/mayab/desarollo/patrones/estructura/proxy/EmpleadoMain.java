package com.mayab.desarollo.patrones.estructura.proxy;

public class EmpleadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado("admin");
		Empleado emp2 = new Empleado("empleado");
		
		emp1.escribirReporte("Ventas 1");
		emp2.escribirReporte("Ventas 2");
		
		emp1.leerReporte();
		emp2.leerReporte();
	}

}
