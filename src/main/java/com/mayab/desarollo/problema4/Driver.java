package com.mayab.desarollo.problema4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertSentence normal = new InsertSentence();
		InsertSentenceLower lower = new InsertSentenceLower();
		InsertSentenceUpper upper = new InsertSentenceUpper();
		
		DBSentenceGenerator generator = new DBSentenceGenerator(normal);
		System.out.println("-----NORMAL-----");
		generator.createSentence("Insert Row Into Table");
		
		System.out.println("-----LOWER-----");
		generator.setSentence(lower);
		generator.createSentence("INSERT ROW INTO TABLE");
		System.out.println("-----UPPER-----");
		generator.setSentence(upper);
		generator.createSentence("INSERT ROW INTO TABLE");
		
		
	}

}
