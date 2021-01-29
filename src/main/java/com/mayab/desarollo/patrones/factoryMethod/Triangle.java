package com.mayab.desarollo.patrones.factoryMethod;

public abstract class Triangle {

	 Double side1;
	 Double side2;
	 Double side3;
	
	 Double calculatePerimeter() {
		 return side1 + side2 + side3;
	 }
	 abstract Double calculateArea();
	 
}
