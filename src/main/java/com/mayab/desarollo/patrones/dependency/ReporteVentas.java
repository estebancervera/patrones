package com.mayab.desarollo.patrones.dependency;

import java.util.List;

public class ReporteVentas implements IReporte {

	
	private List<Ventas> ventas;
	
	
	
	public ReporteVentas(List<Ventas> ventas) {
		super();
		this.ventas = ventas;
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("----[VENTAS]----");
		for(Ventas venta : ventas) {
			System.out.println(venta);
		}
	}

}
