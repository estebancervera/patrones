package com.mayab.desarollo.patrones.creacion.simpleFactory;

public class EquilateralTriangle extends Triangle{

	public EquilateralTriangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	Double calculateArea() {
		// TODO Auto-generated method stub
		Double a = side1/2; 
		Double b = side2;
		Double height = Math.sqrt((Math.pow(a, 2) - Math.pow(b, 2)));
		
		
				
		return (b * height)/2;
	}
}
