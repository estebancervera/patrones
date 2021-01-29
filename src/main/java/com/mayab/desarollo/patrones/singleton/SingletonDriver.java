package com.mayab.desarollo.patrones.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordinator coord1 = new Coordinator("nombre1", "escuela1");
		Coordinator coord2 = new Coordinator("nombre2", "escuela2");
		Coordinator coord3 = new Coordinator("nombre3", "escuela3");
		
		coord1.addClass("lun4pm", "clase1");
		coord2.addClass("lun5pm", "clase2");
		coord3.addClass("lun6pm", "clase3");
		
		SingletonSchedule.getInstance().print();
		
	}

}
