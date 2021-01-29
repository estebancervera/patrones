package com.mayab.desarollo.patrones.factoryMethod;

public class ScaleneTriangle extends Triangle{
	public ScaleneTriangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	Double calculateArea() {
		Double s = this.calculatePerimeter()/2;
		return Math.sqrt(s* (s - side1) * (s - side2) * (s - side3));
	}
}
