package com.mayab.desarollo.problema3;

public class RegistrarAcetileno extends RegistrarLotes {
	@Override
	void registrarParametrosIniciales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Iniciales:");
		System.out.println("- cantidad de tambores (nivel de materia prima)");
		
		
	}

	@Override
	void registrarParametrosFinales() {
		// TODO Auto-generated method stub
		System.out.println("Registrando Parametros Finales:");
		System.out.println("- cantidad final de tambores");
	}

	@Override
	void calcularVolumen() {
		// TODO Auto-generated method stub
		System.out.println("Calculando el volumen");
		System.out.println("- con la formula proporcionada por el gerente de produccion");
		System.out.println("- con el consumo de materia prima");

	}

	@Override
	void realizarInspecciones() {
		// TODO Auto-generated method stub
		System.out.println("Realizando las inspecciones:");
		System.out.println("- estas son mas rigurosas");
		System.out.println("- se debe imprimir checklist del gerente de seguridad");
	}




}
