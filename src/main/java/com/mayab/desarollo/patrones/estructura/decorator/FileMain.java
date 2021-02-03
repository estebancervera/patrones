package com.mayab.desarollo.patrones.estructura.decorator;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new TextFile();
		
		System.out.println(file.read());
		
		System.out.println("--------");
		
		File file2 = new TextFile();
		
		file2 = new Compress(file2);
		file2 = new Encrypt(file2);
		
		System.out.println(file2.write());
		System.out.println(file2.read());
		
		
		
	}

}
