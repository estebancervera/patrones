package com.mayab.desarollo.patrones.estructura.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class EmpleadoAdapter implements PersonaNueva{

	private PersonaVieja personaViejo;
	
	
	public EmpleadoAdapter(PersonaVieja ev1) {
		this.personaViejo = ev1;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return personaViejo.getFirstname() + " " + personaViejo.getLastname();
	}


	@Override
	public int getAge() {

		int age = 0;
		
	    try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(personaViejo.getBirthday());
			Date today = new SimpleDateFormat("dd/MM/yyyy").parse("2/2/2021");
			
			age = today.getYear() - date.getYear();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return age;
	}
	
}
