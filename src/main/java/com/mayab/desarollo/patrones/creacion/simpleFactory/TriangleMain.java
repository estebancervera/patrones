package com.mayab.desarollo.patrones.creacion.simpleFactory;

public class TriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleSimpleFactory factory = new TriangleSimpleFactory();
		
		Triangle t1 = factory.createTriangle(10, 1, 4);
		Triangle t2 = factory.createTriangle(10, 10, 5);
		Triangle t3 = factory.createTriangle(10, 10, 10);
		
		System.out.println(t1.getType());
		System.out.println(t1.calculatePerimeter());
		
		System.out.println("--------------");
		
		System.out.println(t2.getType());
		System.out.println(t2.calculatePerimeter());
		
		System.out.println("--------------");
		
		System.out.println(t3.getType());
		System.out.println(t3.calculatePerimeter());
	}

}
