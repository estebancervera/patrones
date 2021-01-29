package com.mayab.desarollo.patrones.factoryMethod;

public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	Double calculateArea() {
		// TODO Auto-generated method stub
		Double s = this.calculatePerimeter()/2;
		return Math.sqrt(s* (s - side1) * (s - side2) * (s - side3));
	}
}
