package com.mayab.desarollo.patrones.creacion.simpleFactory;

public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Isosceles";
	}
}
