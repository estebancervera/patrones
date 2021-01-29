package com.mayab.desarollo.patrones.abstractFactory;

public class MueblesStore {
	
	AbstractFactory factory;
	Mesa mesa;
	Silla silla;
	Sofa sofa;
	
	void crearSala(String tipo) {
		if(tipo.toLowerCase() =="moderna") {
			factory = new MuebleModernoFactory();
		}else if (tipo.toLowerCase() == "victoriana") {
			factory = new MuebleVictorianoFactory();
		}else if (tipo.toLowerCase() == "ochentera") {
			factory = new MuebleOchenteroFactory();
		}else {
			System.out.println("No tenemos ese estilo de sala");
		}
		
		mesa = factory.createMesa();
		silla = factory.createSilla();
		sofa = factory.createSofa();
		
	}
	
	void entregarSala() {
		System.out.println(mesa.getType());
		System.out.println(silla.getType());
		System.out.println(sofa.getType());
	}
}
