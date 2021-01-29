package com.mayab.desarollo.patrones.singleton;

//Imports
import java.util.HashMap;
import java.util.Map;


/* Un profesor da clase en tres escuelas, 
 * los coordinadores tienen que acceder a 
 * la misma instancia para poder garantizar que estan 
 * viendo el mismo horario
*/

public class SingletonSchedule {
	
	private static SingletonSchedule instance;
	
	private HashMap<String, String> schedule = new HashMap<String, String>();
	
	private SingletonSchedule() {
		
	}
	
	public static SingletonSchedule getInstance() {
		if(instance == null)
			instance = new SingletonSchedule();
		return instance;
	}
	
	
	
	public void addClass(String hour, String className) {
		schedule.put(hour, className);
	}
	
	public void print() {
		for(Map.Entry me : schedule.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}
	}
	
}
