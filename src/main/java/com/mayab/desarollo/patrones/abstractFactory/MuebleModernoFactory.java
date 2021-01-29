package com.mayab.desarollo.patrones.abstractFactory;

public class MuebleModernoFactory implements AbstractFactory {

	@Override
	public Silla createSilla() {
		// TODO Auto-generated method stub
		return new SillaModerna();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaModerno();
	}

	@Override
	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaModerna();
	}

}
