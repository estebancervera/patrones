package com.mayab.desarollo.patrones.comportamiento.template;

public class MainArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesarExcel ex = new ProcesarExcel();
		ProcesarJson js = new ProcesarJson();
		
		System.out.println("----EXCEL-----");
		ex.procesar();
		System.out.println("----JSON-----");
		js.procesar();
	}

}
