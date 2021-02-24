package com.mayab.desarollo.parcial1.problema2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto blockMerida = new Block(100.0); //todos los block con el mismo precio para que se pueda comparar el precio final
		Producto blockChetumal = new Block(100.0);
		Producto blockSinIVA = new Block(100.0);
		
		System.out.println("--BLOCK MERIDA (TAX-16%)---");
		
		blockMerida = new IvaRegular(blockMerida);
		System.out.println("PRECIO FINAL: " + blockMerida.calcularPrecioFinal());
		
		System.out.println("");
		
		System.out.println("--BLOCK MERIDA (TAX-16%) CON DESCUENTO (20%)---");
		
		blockMerida = new Descuento(blockMerida, 0.20); //descuento del 20%
		System.out.println("PRECIO FINAL: " + blockMerida.calcularPrecioFinal());
		
		System.out.println("");
		
		System.out.println("--BLOCK CHETUMAL (TAX-8%) ---");
		
		blockChetumal = new IvaCuidadesFronterizas(blockChetumal);
		System.out.println("PRECIO FINAL: " + blockChetumal.calcularPrecioFinal());
		
		System.out.println("");
				
		System.out.println("--BLOCK CHETUMAL (TAX-8%) CON DESCUENTO (20%)---");
		
		blockChetumal = new Descuento(blockChetumal, 0.20);  //descuento del 20%
		System.out.println("PRECIO FINAL: " + blockChetumal.calcularPrecioFinal());
		
		System.out.println("");
		
		System.out.println("--BLOCK CHETUMAL (TAX-8%) CON DESCUENTO (20%) Y IMPUESTO RUMORADO (TAX-2%)---");
		
		blockChetumal = new IvaRumorado(blockChetumal); 
		System.out.println("PRECIO FINAL: " + blockChetumal.calcularPrecioFinal());
		
		System.out.println("");
		
		System.out.println("--BLOCK SIN IVA (TAX-0%) Y DESCUENTO (20%) ---");
		
		blockSinIVA = new Descuento(blockSinIVA, 0.20);
		System.out.println("PRECIO FINAL: " + blockSinIVA.calcularPrecioFinal());
		
		System.out.println("");
		
	}

}
