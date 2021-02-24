package com.mayab.desarollo.problema3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrarAltaPresion oxigeno = new RegistrarAltaPresion();
		RegistrarLiquidos dioxidoCarbono = new RegistrarLiquidos();
		RegistrarAcetileno acetileno = new RegistrarAcetileno();
				
		System.out.println("====== OXIGENO =====");
		oxigeno.registrarLLenado();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("====== Dioxido de Carbono =====");
		dioxidoCarbono.registrarLLenado();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("====== Acetileno =====");
		acetileno.registrarLLenado();
		
		System.out.println("");
		System.out.println("");
	}

}
