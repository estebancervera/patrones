package com.mayab.desarollo.patrones.factoryMethod;

public class TriangleSimpleFactory {

	public Triangle createTriangle(Double side1, Double side2, Double side3) {
		if(side1 == side2 && side2 == side3) {
			return new EquilateralTriangle(side1, side2, side3);
		}else if (side1 == side2 && side2 != side3) {
			return new IsoscelesTriangle(side1, side2, side3);
		}else if (side1 != side2 && side2 != side3){
			return new ScaleneTriangle(side1, side2, side3);
		}
		return null;
	}
}
