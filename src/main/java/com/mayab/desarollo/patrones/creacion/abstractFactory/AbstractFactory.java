package com.mayab.desarollo.patrones.creacion.abstractFactory;

public interface AbstractFactory {
	
	Silla createSilla();
	Sofa createSofa();
	Mesa createMesa();
}
