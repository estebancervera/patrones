package com.mayab.desarollo.patrones.dependency;

public class ReporteVentasProxy implements IReporte {
	private ReporteVentas reporte;
	private Empleado e;
	private IServicioDatos servicio;
	
	
	public ReporteVentasProxy(Empleado e, IServicioDatos servicio) {
		super();
		this.servicio = servicio;
		this.e = e;
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		if(e.getTipo() == "admin") {
			this.reporte = new ReporteVentas(servicio.getAllVentas());
			
		}else {
			this.reporte = new ReporteVentas(servicio.getVentasFromEmpleado(e));
			
		}
		reporte.imprimir();
	}

}
