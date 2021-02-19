package com.mayab.desarollo.patrones.dependency;

import java.util.List;

public interface IServicioDatos {
	List<Ventas> getAllVentas();
	List<Ventas> getVentasFromEmpleado(Empleado e);
	void addVenta(Ventas v);
}
