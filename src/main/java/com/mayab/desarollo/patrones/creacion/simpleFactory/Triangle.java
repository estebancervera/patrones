package com.mayab.desarollo.patrones.creacion.simpleFactory;

public abstract class Triangle {

	 int side1;
	 int side2;
	 int side3;
	
	 int calculatePerimeter() {
		 return side1 + side2 + side3;
	 }
	
	 abstract String getType();
	 
}
