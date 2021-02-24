package com.mayab.desarollo.patrones.creacion.abstractFactory;

public class MuebleOchenteroFactory implements AbstractFactory{

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaOchentera();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaOchentero();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaOchentera();
	}

}
