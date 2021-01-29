package com.mayab.desarollo.patrones.abstractFactory;

public class MuebleVictorianoFactory implements AbstractFactory{

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaVictoriana();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaVictoriano();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaVictoriana();
	}

}
