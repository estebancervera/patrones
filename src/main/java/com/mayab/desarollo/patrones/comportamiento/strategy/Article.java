package com.mayab.desarollo.patrones.comportamiento.strategy;

public class Article {
	private String name;
	private Double precio;
	private int quantity;
	
	
	
	public Article(String name, Double precio, int quantity) {
		super();
		this.name = name;
		this.precio = precio;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public Double getPrecio() {
		return precio;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
