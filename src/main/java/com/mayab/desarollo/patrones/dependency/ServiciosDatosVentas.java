package com.mayab.desarollo.patrones.dependency;

import java.util.ArrayList;
import java.util.List;

public class ServiciosDatosVentas implements IServicioDatos {

	private List<Ventas> ventas;
	
	
	
	public ServiciosDatosVentas() {
		
		ventas = new ArrayList<Ventas>();
	}

	@Override
	public List<Ventas> getAllVentas() {
		// TODO Auto-generated method stub
		return ventas;
	}

	@Override
	public List<Ventas> getVentasFromEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		ArrayList ventasEmp = new ArrayList<Ventas>();
	for(Ventas venta: ventas) {
		if(venta.getE().getNombre() == e.getNombre()) {
			ventasEmp.add(venta);
		}
		}
		return ventasEmp;
	}

	@Override
	public void addVenta(Ventas v) {
		// TODO Auto-generated method stub
		ventas.add(v);
	}

}
