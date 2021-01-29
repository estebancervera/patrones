package com.mayab.desarollo.patrones.factoryMethod;

public abstract class TriangleCreator {

	 abstract Triangle createTriangle(Double side, Double side2 ,Double side3 );
	 
	 public Double calculatePerimeter(Triangle triangle) {
		 
		return triangle.side1 + triangle.side2 + triangle.side3;
		 
	 }
	 
	 
}
