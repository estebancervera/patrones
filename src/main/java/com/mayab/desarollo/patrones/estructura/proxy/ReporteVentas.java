package com.mayab.desarollo.patrones.estructura.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReporteVentas implements Reporte {
	private File archivo;
	
	
	
	public ReporteVentas() {
		super();
		
		try {
		      archivo = new File("reporteVentas.txt");
		      if (archivo.createNewFile()) {
		        System.out.println("File created: " + archivo.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		try {
		      Scanner myReader = new Scanner(archivo);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println("--Reporte---");
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      System.out.println(archivo.getName());
		      e.printStackTrace();
		    }
	}

	@Override
	public void escribir(String contenido) {
		// TODO Auto-generated method stub
		try {
		      FileWriter myWriter = new FileWriter("reporteVentas.txt");
		      myWriter.write(contenido);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
