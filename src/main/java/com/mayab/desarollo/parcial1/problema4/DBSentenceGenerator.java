package com.mayab.desarollo.parcial1.problema4;

public class DBSentenceGenerator {
	private InsertSentenceGenerable sentence;

	public DBSentenceGenerator(InsertSentenceGenerable sentence) {
		this.sentence = sentence;
	}
	
	public void createSentence(String sentence) {
		System.out.println(this.sentence.crearSentence(sentence));
	}

	public InsertSentenceGenerable getSentence() {
		return sentence;
	}

	public void setSentence(InsertSentenceGenerable sentence) {
		this.sentence = sentence;
	}
	
	
}
