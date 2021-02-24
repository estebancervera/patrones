package com.mayab.desarollo.problema3;

public abstract class RegistrarLotes {
	final void registrarLLenado() {
		registrarParametrosIniciales();
		registrarParametrosFinales();
		calcularVolumen();
		 realizarInspecciones();
		 imprimirReporte();
	}
	
	abstract void registrarParametrosIniciales() ;
	abstract void registrarParametrosFinales() ;
	abstract void calcularVolumen() ;
	abstract void realizarInspecciones() ;
	 void imprimirReporte() {
		// TODO Auto-generated method stub
			System.out.println("Imprimiendo Reporte:");
			System.out.println("------------REPORTE------------");
			System.out.println("| fecha:               25/2/21 |");
			System.out.println("| cantidad:            200 env |");
			System.out.println("| consumo materia P :   15 ton |");
			System.out.println("| _________       ____________ |");
			System.out.println("| operador         inspector   |");
			System.out.println("-------------------------------");
	 };
	
	
}
