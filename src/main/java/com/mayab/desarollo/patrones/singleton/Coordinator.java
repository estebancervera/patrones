package com.mayab.desarollo.patrones.singleton;

public class Coordinator {

	public String name;
	public String school;
	
	public Coordinator(String name, String school) {
		this.name = name;
		this.school = school;
	}
	
	public void addClass(String hour, String className) {
		SingletonSchedule.getInstance().addClass(hour, className);
	}
}
