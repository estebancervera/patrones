package com.mayab.desarollo.patrones.estructura.adapter;

import java.util.ArrayList;

public class EmpleadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaVieja ev1 = new EmpleadoViejo("Esteban", "Cervera", "5/22/1999");
		
		EmpleadoAdapter adapterEmp = new EmpleadoAdapter(ev1);
		
		PersonaNueva en = new EmpleadoNuevo("Carlos Cervera", 25);
		
		ArrayList<PersonaNueva> arr = new ArrayList<PersonaNueva>();
		
		arr.add(en);
		arr.add(adapterEmp);
		
		
		for(PersonaNueva persona: arr) {
			System.out.println("---------------");
			System.out.println("NOMBRE: " + persona.getName());
			System.out.println("EDAD: " + persona.getAge());
			System.out.println("---------------");
		}
		
	}

}
