package com.mayab.desarollo.patrones.creacion.simpleFactory;

public class TriangleSimpleFactory {

	public Triangle createTriangle(int side1, int side2, int side3) {
		if(side1 == side2 && side2 == side3) {
			//System.out.println("1");
			return new EquilateralTriangle(side1, side2, side3);
		}else if ((side1 == side2 && side2 != side3)||(side1 == side3 && side1 != side2) ) {
			//System.out.println("2");
			return new IsoscelesTriangle(side1, side2, side3);
		}else if (side1 != side2 && side2 != side3){
			//System.out.println("3");
			return new ScaleneTriangle(side1, side2, side3);
		}
		return null;
	}
}
