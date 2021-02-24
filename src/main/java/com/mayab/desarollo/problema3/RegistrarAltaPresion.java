package com.mayab.desarollo.problema3;

public class RegistrarAltaPresion extends RegistrarLotes {

	@Override
	void registrarParametrosIniciales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Iniciales:");
		System.out.println("- uso de la bomba");
		System.out.println("- horas de uso");
		System.out.println("- nivel de materia prima");
		
	}

	@Override
	void registrarParametrosFinales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Finales:");
		System.out.println("- presion de los envases");
		System.out.println("- temperatura de los envases");
		System.out.println("- nivel de materia prima");
	}

	@Override
	void calcularVolumen() {
		// TODO Auto-generated method stub
		System.out.println("Calculando el volumen");
		System.out.println("- con la formula proporcionada por la empresa");
		System.out.println("- con la presion, temperatura, y cantidad de los envases");

	}

	@Override
	void realizarInspecciones() {
		// TODO Auto-generated method stub
		System.out.println("Realizando las inspecciones:");
		System.out.println("- se debe imprimir checklist del gerente de seguridad");
	}

	

}
