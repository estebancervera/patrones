package com.mayab.desarollo.patrones.estructura.adapter;

public class EmpleadoNuevo implements PersonaNueva {
	
	private String name;
	private int age;

	public EmpleadoNuevo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

}
