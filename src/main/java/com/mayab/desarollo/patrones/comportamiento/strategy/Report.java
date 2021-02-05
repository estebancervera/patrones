package com.mayab.desarollo.patrones.comportamiento.strategy;

import java.util.ArrayList;

public abstract class Report {

	protected ExportBehavior expB;
	
	private ArrayList<Article> articles = new ArrayList<Article>();

	public Report() {
		
		
	}
	
	public void setExpB(ExportBehavior expB){
		this.expB = expB;
	}
	
	public void performExport() {
		System.out.println("---------");
		System.out.println(this.expB.export());
		System.out.println("---------");
		for(Article article: articles) {
			System.out.println("---------");
			System.out.println("NOMBRE: " + article.getName());
			System.out.print("| PRECIO: " + article.getPrecio());
			System.out.print("| CANTIDAD: " + article.getQuantity());
			
		}
		System.out.println("---------");
		
	}
	
	public void addArticle(Article art){
		articles.add(art);
	}
	
}
