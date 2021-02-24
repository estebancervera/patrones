package com.mayab.desarollo.problema3;

public abstract class RegistrarLotes {
	final void llenar() {
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
	abstract void imprimirReporte() ;
	
	
}
