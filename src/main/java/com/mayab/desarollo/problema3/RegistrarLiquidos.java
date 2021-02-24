package com.mayab.desarollo.problema3;

public class RegistrarLiquidos extends RegistrarLotes {

	@Override
	void registrarParametrosIniciales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Iniciales:");
		System.out.println("- nivel de materia prima");
		
	}

	@Override
	void registrarParametrosFinales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Finales:");
		System.out.println("- nivel actual de materia prima");
	}

	@Override
	void calcularVolumen() {
		// TODO Auto-generated method stub
		System.out.println("Calculando el volumen");
		System.out.println("- con la diferencia entre materia prima incial y final");
	
	}

	@Override
	void realizarInspecciones() {
		// TODO Auto-generated method stub
		System.out.println("Realizando las inspecciones:");
		System.out.println("- son menos rigurosas");
		System.out.println("- se debe imprimir checklist del gerente de seguridad");
	}



}
