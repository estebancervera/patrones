package com.mayab.desarollo.patrones.creacion.abstractFactory;

public class MueblesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MueblesStore tienda = new MueblesStore();
		
		tienda.crearSala("moderna");
		tienda.entregarSala();
		System.out.println("--------------------------");
		tienda.crearSala("victoriana");
		tienda.entregarSala();
		System.out.println("--------------------------");
		tienda.crearSala("ochentera");
		tienda.entregarSala();
		System.out.println("--------------------------");
	}

}
